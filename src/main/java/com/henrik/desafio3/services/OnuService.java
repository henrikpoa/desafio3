package com.henrik.desafio3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.henrik.desafio3.dto.OnuDTO;
import com.henrik.desafio3.entities.Onu;
import com.henrik.desafio3.repositories.OnuRepository;
import com.henrik.desafio3.services.exceptions.ResourceNotFoundException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class OnuService {
	
	@Autowired
	private OnuRepository repository;
	
	@Transactional(readOnly = true)
	public OnuDTO findById(Long id) {
		Onu onu = repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Id não encontrado"));		
		return new OnuDTO(onu);
	}
	
	@Transactional(readOnly = true)	
	public Page <OnuDTO> findAll (Pageable pageable) { 
		Page<Onu> result =	repository.findAll(pageable); 
		return result.map(x -> new OnuDTO(x));
	}
	 
	/*
	 * public List<OnuDTO> findAll () { List<Onu> result = repository.findAll();
	 * return result.stream().map(x -> new OnuDTO(x)).toList(); }
	 */
	
	
	@Transactional
	public OnuDTO insert(OnuDTO dto) {
		Onu entity = new Onu();
		copyDTOToEntity(dto, entity);		
		entity = repository.save(entity);		
		return new OnuDTO(entity);
	}
	
	private void copyDTOToEntity(OnuDTO dto, Onu entity) {
		entity.setOnu_name(dto.getName());
		entity.setIp(dto.getIp());
		entity.setVlan_name(dto.getVlan_name());
		entity.setVlan_name3(dto.getVlan_name3());
		entity.setVlan_name4(dto.getVlan_name4());
		entity.setVlan_name5(dto.getVlan_name5());
		entity.setVlan_name6(dto.getVlan_name6());
		entity.setVlan_name7(dto.getVlan_name7());
		entity.setVlan_name8(dto.getVlan_name8());
		entity.setVlan_name9(dto.getVlan_name9());
		entity.setVlan_name10(dto.getVlan_name10());
		entity.setVlan_id(dto.getVlan_id());
		entity.setVlan_id3(dto.getVlan_id3());
		entity.setVlan_id4(dto.getVlan_id4());
		entity.setVlan_id5(dto.getVlan_id5());
		entity.setVlan_id6(dto.getVlan_id6());
		entity.setVlan_id7(dto.getVlan_id7());
		entity.setVlan_id8(dto.getVlan_id8());
		entity.setVlan_id9(dto.getVlan_id9());
		entity.setVlan_id10(dto.getVlan_id10());
		entity.setPon(dto.getPon());
		entity.setSerial(dto.getSerial());
		entity.setOnu_number(dto.getOnu_number());
		entity.setVlan_ger(dto.getVlan_ger());
		entity.setCommand(ConcatString(dto));
		
	}
	
	private String ConcatString(OnuDTO dto) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("vlan " + dto.getVlan_id() + "\n\n");
		sb.append("name " + dto.getVlan_name() + "\n\n");
		sb.append("exit\n\n");
		sb.append("interface xgei-1/4/1\n\n");
		sb.append("switchport vlan " + dto.getVlan_id() + " tag\n\n");
		sb.append("exit\n\n");
		sb.append("interface gpon_olt-"+ dto.getPon() + "\n\n");
		sb.append("onu " + dto.getOnu_number() + " type F8648P sn " + dto.getSerial() + "\n\n");
		sb.append("exit\n\n");
		sb.append("interface gpon_onu-" + dto.getPon() +":" + dto.getOnu_number() + "\n\n");
		sb.append("vport-mode manual\n\n"				
				+ "tcont 1 profile 512K\n\n"				
				+ "tcont 2 profile 1G\n\n"				
				+ "gemport 1 tcont 1\n\n"				  
				+ "gemport 2 tcont 2\n\n"				
				+ "vport 1 map-type vlan\n\n"				
				+ "vport 2 map-type vlan\n\n");
		
		String vlan3 = dto.getVlan_id3();
		String vlan4 = dto.getVlan_id4();
		String vlan5 = dto.getVlan_id5();
		String vlan6 = dto.getVlan_id6();
		String vlan7 = dto.getVlan_id7();
		String vlan8 = dto.getVlan_id8();
		String vlan9 = dto.getVlan_id9();
		String vlan10 = dto.getVlan_id10();
		
		if ( vlan3 != null ) {
			sb.append("gemport 3 tcont 2\n\n" 
					+ "vport 3 map-type vlan\n\n");
		}
		if ( vlan4 != null ) {
			sb.append("gemport 4 tcont 2\n\n" 
					+ "vport 4 map-type vlan\n\n");
		}		
		if ( vlan5 != null ) {
			sb.append("gemport 5 tcont 2\n\n" 
					+ "vport 5 map-type vlan\n\n");
		}
		if ( vlan6 != null ) {
			sb.append("gemport 6 tcont 2\n\n" 
					+ "vport 6 map-type vlan\n\n");
		}
		if ( vlan7 != null ) {
			sb.append("gemport 7 tcont 2\n\n" 
					+ "vport 7 map-type vlan\n\n");
		}
		if ( vlan8 != null ) {
			sb.append("gemport 8 tcont 2\n\n" 
					+ "vport 8 map-type vlan\n\n");
		}
		if ( vlan9 != null ) {
			sb.append("gemport 9 tcont 2\n\n" 
					+ "vport 9 map-type vlan\n\n");
		}
		if ( vlan10 != null ) {
			sb.append("gemport 10 tcont 2\n\n" 
					+ "vport 10 map-type vlan\n\n");
		}
		sb.append( "vport-map 1 1 vlan " + dto.getVlan_ger() + "\n\n"				
				+ "vport-map 2 2 vlan " + dto.getVlan_id() + "\n\n"	);
		if ( vlan3 != null ) {
			sb.append("vport-map 3 3 vlan " + dto.getVlan_id3() + "\n\n");
		}
		if ( vlan4 != null ) {
			sb.append("vport-map 4 4 vlan " + dto.getVlan_id4() + "\n\n");
		}		
		if ( vlan5 != null ) {
			sb.append("vport-map 5 5 vlan " + dto.getVlan_id5() + "\n\n");
		}		
		if ( vlan6 != null ) {
			sb.append("vport-map 6 6 vlan " + dto.getVlan_id6() + "\n\n");
		}
		if ( vlan7 != null ) {
			sb.append("vport-map 7 7 vlan " + dto.getVlan_id7() + "\n\n");
		}
		if ( vlan8 != null ) {
			sb.append("vport-map 8 8 vlan " + dto.getVlan_id8() + "\n\n");
		}
		if ( vlan9 != null ) {
			sb.append("vport-map 9 9 vlan " + dto.getVlan_id9() + "\n\n");
		}
		if ( vlan10 != null ) {
			sb.append("vport-map 10 10 vlan " + dto.getVlan_id10() + "\n\n");
		}
		sb.append("exit\n\n");
		sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".1\n\n"
				+ "service-port 1 user-vlan " + dto.getVlan_ger() + " vlan " + dto.getVlan_ger() +"\n\n"				
				+ "exit\n\n"
				+ "interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".2\n\n"		
				+ "service-port 2 user-vlan " + dto.getVlan_id() + " vlan " + dto.getVlan_id() + "\n\n"
				+ "exit\n\n");
		if ( vlan3 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".3\n\n"				
					+ "service-port 3 user-vlan " + dto.getVlan_id3() + " vlan " + dto.getVlan_id3() +"\n\n"				
					+ "exit\n\n");
		}
		if ( vlan4 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".4\n\n"				
					+ "service-port 4 user-vlan " + dto.getVlan_id4() + " vlan " + dto.getVlan_id4() +"\n\n"				
					+ "exit\n\n");
		}
		if ( vlan5 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".5\n\n"				
					+ "service-port 5 user-vlan " + dto.getVlan_id5() + " vlan " + dto.getVlan_id5() +"\n\n"				
					+ "exit\n\n");
		}
		if ( vlan6 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".6\n\n"				
					+ "service-port 6 user-vlan " + dto.getVlan_id6() + " vlan " + dto.getVlan_id6() +"\n\n"				
					+ "exit\n\n");
		}
		if ( vlan7 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".7\n\n"				
					+ "service-port 7 user-vlan " + dto.getVlan_id7() + " vlan " + dto.getVlan_id7() +"\n\n"				
					+ "exit\n\n");
		}
		if ( vlan8 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".8\n\n"				
					+ "service-port 8 user-vlan " + dto.getVlan_id8() + " vlan " + dto.getVlan_id8() +"\n\n"				
					+ "exit\n\n");
		}
		if ( vlan9 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".9\n\n"				
					+ "service-port 9 user-vlan " + dto.getVlan_id9() + " vlan " + dto.getVlan_id9() +"\n\n"				
					+ "exit\n\n");
		}
		if ( vlan10 != null ) {
			sb.append("interface vport-" + dto.getPon() + ":" + dto.getOnu_number() + ".10\n\n"				
					+ "service-port 10 user-vlan " + dto.getVlan_id10() + " vlan " + dto.getVlan_id10() +"\n\n"				
					+ "exit\n\n");
		}
		
		String gateway = regexGateway(dto.getIp());
		
		sb.append("pon-onu-mng gpon_onu-" + dto.getPon() + ":" + dto.getOnu_number() + "\n\n"
				+ "security-mgmt 1 state enable mode forward ingress-type iphost 1 protocol web\n\n"
				+ "wan-ip ipv4 mode static gateway " + gateway + " primary-dns 10.252.64.2 second-dns 10.252.64.3 ip-address " + dto.getIp() + " mask 255.255.255.0 vlan-profile VLAN" + dto.getVlan_ger() + " host 1\n\n"				
				+ "service GERENCIA gemport 1 vlan " + dto.getVlan_ger() + "\n\n"				
				+ "service " + dto.getVlan_name() + " gemport 2 vlan " + dto.getVlan_id() + "\n\n"			
				+ "vlan port eth_0/1 mode hybrid def-vlan " + dto.getVlan_id() + "\n\n");
		if ( vlan3 != null ) {
		sb.append( "service " + dto.getVlan_name3() + " gemport 3 vlan " + dto.getVlan_id3() + "\n\n"
				+ "vlan port eth_0/1 vlan " + dto.getVlan_id3() + "\n\n");
		}
		if ( vlan4 != null ) {
			sb.append( "service " + dto.getVlan_name4() + " gemport 4 vlan " + dto.getVlan_id4() + "\n\n"
					+ "vlan port eth_0/1 vlan " + dto.getVlan_id4() + "\n\n");
		}
		if ( vlan5 != null ) {
			sb.append( "service " + dto.getVlan_name5() + " gemport 5 vlan " + dto.getVlan_id5() + "\n\n"
					+ "vlan port eth_0/1 vlan " + dto.getVlan_id5() + "\n\n");
		}
		if ( vlan6 != null ) {
			sb.append( "service " + dto.getVlan_name6() + " gemport 6 vlan " + dto.getVlan_id6() + "\n\n"
					+ "vlan port eth_0/1 vlan " + dto.getVlan_id6() + "\n\n");
		}
		if ( vlan7 != null ) {
			sb.append( "service " + dto.getVlan_name7() + " gemport 7 vlan " + dto.getVlan_id7() + "\n\n"
					+ "vlan port eth_0/1 vlan " + dto.getVlan_id7() + "\n\n");
		}
		if ( vlan8 != null ) {
			sb.append( "service " + dto.getVlan_name8() + " gemport 8 vlan " + dto.getVlan_id8() + "\n\n"
					+ "vlan port eth_0/1 vlan " + dto.getVlan_id8() + "\n\n");
		}
		if ( vlan9 != null ) {
			sb.append( "service " + dto.getVlan_name9() + " gemport 9 vlan " + dto.getVlan_id9() + "\n\n"
					+ "vlan port eth_0/1 vlan " + dto.getVlan_id9() + "\n\n");
		}
		if ( vlan10 != null ) {
			sb.append( "service " + dto.getVlan_name10() + " gemport 10 vlan " + dto.getVlan_id10() + "\n\n"
					+ "vlan port eth_0/1 vlan " + dto.getVlan_id10() + "\n\n");
		}
		
		String result = sb.toString();
		return result;
		
	}
	
	private String regexGateway (String ip) {
		
		String regex = "(\\d+\\.\\d+\\.\\d+)\\.\\d+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(ip);
		String result = matcher.replaceAll("$1.1");
		return result;		
	}

}
