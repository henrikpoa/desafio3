package com.henrik.desafio3.dto;

import com.henrik.desafio3.entities.Onu;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public class OnuDTO {
	
	@NotBlank(message = "não pode ser vazio")
    @Column(unique=true)
	private String ip;
	private String pon;
	private String command;	
	
	private String serial;
	private Long id;	
	
	private String name;	
	private String slot;
	private String vlan_ger;
	private String onu_number;	
	private String vlan_name1;
	private String vlan_name2;
	private String vlan_name3;
	private String vlan_name4;
	private String vlan_name5;
	private String vlan_name6;
	private String vlan_name7;
	private String vlan_name8;
	private String vlan_name9;
	private String vlan_name10;
	private String vlan_name;	
	private String vlan_id1;
	private String vlan_id2;
	private String vlan_id3;
	private String vlan_id4;
	private String vlan_id5;
	private String vlan_id6;
	private String vlan_id7;
	private String vlan_id8;
	private String vlan_id9;
	private String vlan_id10;
	private String vlan_id;
	
	
	public OnuDTO(Long id, String name, String ip, String vlan_name, String vlan_id, String slot, String command, String vlan_name1,
			String vlan_name2,String vlan_name3, String vlan_name4, String vlan_name5, String vlan_name6, String vlan_name7,String vlan_name8,
			String vlan_name9, String vlan_name10, String vlan_id1,String vlan_id2, String vlan_id3, String vlan_id4, String vlan_id5,
			String vlan_id6, String vlan_id7, String vlan_id8, String vlan_id9, String vlan_id10, String pon, String serial, 
			String vlan_ger, String onu_number) {		
		this.id = id;
		this.name = name;
		this.ip = ip;
		this.pon = pon;
		this.vlan_name = vlan_name;
		this.vlan_name1 = vlan_name1;
		this.vlan_name2 = vlan_name2;
		this.vlan_name3 = vlan_name3;
		this.vlan_name4 = vlan_name4;
		this.vlan_name5 = vlan_name5;
		this.vlan_name6 = vlan_name6;
		this.vlan_name7 = vlan_name7;
		this.vlan_name8 = vlan_name8;
		this.vlan_name9 = vlan_name9;
		this.vlan_name10 = vlan_name10;
		this.vlan_id = vlan_id;
		this.vlan_id1 = vlan_id1;
		this.vlan_id2 = vlan_id2;
		this.vlan_id3 = vlan_id3;
		this.vlan_id4 = vlan_id4;
		this.vlan_id5 = vlan_id5;
		this.vlan_id6 = vlan_id6;
		this.vlan_id7 = vlan_id7;
		this.vlan_id8 = vlan_id8;
		this.vlan_id9 = vlan_id9;
		this.vlan_id10 = vlan_id10;
		this.slot = slot;
		this.command = command;
		this.serial = serial;
		this.vlan_ger = vlan_ger;
		this.onu_number = onu_number;
		
	}		

	
	public OnuDTO(Onu entity) {
		id = entity.getId();
		name = entity.getOnu_name();
		ip = entity.getIp();
		pon = entity.getPon();
		slot = entity.getSlot();
		command = entity.getCommand();
		vlan_ger = entity.getVlan_ger();
		onu_number = entity.getOnu_number();
		serial = entity.getSerial();
		vlan_id = entity.getVlan_id();
		vlan_id1 = entity.getVlan_id1();
		vlan_id2 = entity.getVlan_id2();
		vlan_id3 = entity.getVlan_id3();
		vlan_id4 = entity.getVlan_id4();
		vlan_id5 = entity.getVlan_id5();
		vlan_id6 = entity.getVlan_id6();
		vlan_id7 = entity.getVlan_id7();
		vlan_id8 = entity.getVlan_id8();
		vlan_id9 = entity.getVlan_id9();
		vlan_id10 = entity.getVlan_id10();
		vlan_name = entity.getVlan_name();
		vlan_name1 = entity.getVlan_name1();
		vlan_name2 = entity.getVlan_name2();
		vlan_name3 = entity.getVlan_name3();
		vlan_name4 = entity.getVlan_name4();
		vlan_name5 = entity.getVlan_name5();
		vlan_name6 = entity.getVlan_name6();
		vlan_name7 = entity.getVlan_name7();
		vlan_name8 = entity.getVlan_name8();
		vlan_name9 = entity.getVlan_name9();
		vlan_name10 = entity.getVlan_name10();		
	}


	public String getIp() {
		return ip;
	}


	public String getPon() {
		return pon;
	}


	public String getCommand() {
		return command;
	}


	public String getSerial() {
		return serial;
	}


	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getSlot() {
		return slot;
	}


	public String getVlan_ger() {
		return vlan_ger;
	}


	public String getOnu_number() {
		return onu_number;
	}


	public String getVlan_name1() {
		return vlan_name1;
	}


	public String getVlan_name2() {
		return vlan_name2;
	}


	public String getVlan_name3() {
		return vlan_name3;
	}


	public String getVlan_name4() {
		return vlan_name4;
	}


	public String getVlan_name5() {
		return vlan_name5;
	}


	public String getVlan_name6() {
		return vlan_name6;
	}


	public String getVlan_name7() {
		return vlan_name7;
	}


	public String getVlan_name8() {
		return vlan_name8;
	}


	public String getVlan_name9() {
		return vlan_name9;
	}


	public String getVlan_name10() {
		return vlan_name10;
	}


	public String getVlan_name() {
		return vlan_name;
	}


	public String getVlan_id1() {
		return vlan_id1;
	}


	public String getVlan_id2() {
		return vlan_id2;
	}


	public String getVlan_id3() {
		return vlan_id3;
	}


	public String getVlan_id4() {
		return vlan_id4;
	}


	public String getVlan_id5() {
		return vlan_id5;
	}


	public String getVlan_id6() {
		return vlan_id6;
	}


	public String getVlan_id7() {
		return vlan_id7;
	}


	public String getVlan_id8() {
		return vlan_id8;
	}


	public String getVlan_id9() {
		return vlan_id9;
	}


	public String getVlan_id10() {
		return vlan_id10;
	}


	public String getVlan_id() {
		return vlan_id;
	}
}
