package com.henrik.desafio3.entities;

import java.util.Objects;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_onu")
public class Onu {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String onu_name;
	private String ip;
	private String vlan_name;
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
	private String vlan_id;
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
	private String slot;
	@Lob 
	@Basic(fetch = FetchType.LAZY)
	private String command;
	private String serial;
	private String pon;
	private String vlan_ger;
	private String onu_number;
	
	public Onu() {}

	public Onu(Long id, String onu_name, String ip, String vlan_name1, String vlan_name2, String vlan_name3,
			String vlan_name4, String vlan_name5, String vlan_name6, String vlan_name7, String vlan_name8,
			String vlan_name9, String vlan_name10, String vlan_id1, String vlan_id2, String vlan_id3, String vlan_id4,
			String vlan_id5, String vlan_id6, String vlan_id7, String vlan_id8, String vlan_id9, String vlan_id10,
			String slot, String command, String serial, String pon, String vlan_ger, String onu_number) {
		super();
		this.id = id;
		this.onu_name = onu_name;
		this.ip = ip;
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
		this.pon = pon;
		this.vlan_ger = vlan_ger;
		this.onu_number = onu_number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOnu_name() {
		return onu_name;
	}

	public void setOnu_name(String onu_name) {
		this.onu_name = onu_name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	public String getVlan_name() {
		return vlan_name;
	}

	public void setVlan_name(String vlan_name) {
		this.vlan_name = vlan_name;
	}

	public String getVlan_name1() {
		return vlan_name1;
	}

	public void setVlan_name1(String vlan_name1) {
		this.vlan_name1 = vlan_name1;
	}

	public String getVlan_name2() {
		return vlan_name2;
	}

	public void setVlan_name2(String vlan_name2) {
		this.vlan_name2 = vlan_name2;
	}

	public String getVlan_name3() {
		return vlan_name3;
	}

	public void setVlan_name3(String vlan_name3) {
		this.vlan_name3 = vlan_name3;
	}

	public String getVlan_name4() {
		return vlan_name4;
	}

	public void setVlan_name4(String vlan_name4) {
		this.vlan_name4 = vlan_name4;
	}

	public String getVlan_name5() {
		return vlan_name5;
	}

	public void setVlan_name5(String vlan_name5) {
		this.vlan_name5 = vlan_name5;
	}

	public String getVlan_name6() {
		return vlan_name6;
	}

	public void setVlan_name6(String vlan_name6) {
		this.vlan_name6 = vlan_name6;
	}

	public String getVlan_name7() {
		return vlan_name7;
	}

	public void setVlan_name7(String vlan_name7) {
		this.vlan_name7 = vlan_name7;
	}

	public String getVlan_name8() {
		return vlan_name8;
	}

	public void setVlan_name8(String vlan_name8) {
		this.vlan_name8 = vlan_name8;
	}

	public String getVlan_name9() {
		return vlan_name9;
	}

	public void setVlan_name9(String vlan_name9) {
		this.vlan_name9 = vlan_name9;
	}

	public String getVlan_name10() {
		return vlan_name10;
	}

	public void setVlan_name10(String vlan_name10) {
		this.vlan_name10 = vlan_name10;
	}
	
	
	public String getVlan_id() {
		return vlan_id;
	}

	public void setVlan_id(String vlan_id) {
		this.vlan_id = vlan_id;
	}

	public String getVlan_id1() {
		return vlan_id1;
	}

	public void setVlan_id1(String vlan_id1) {
		this.vlan_id1 = vlan_id1;
	}

	public String getVlan_id2() {
		return vlan_id2;
	}

	public void setVlan_id2(String vlan_id2) {
		this.vlan_id2 = vlan_id2;
	}

	public String getVlan_id3() {
		return vlan_id3;
	}

	public void setVlan_id3(String vlan_id3) {
		this.vlan_id3 = vlan_id3;
	}

	public String getVlan_id4() {
		return vlan_id4;
	}

	public void setVlan_id4(String vlan_id4) {
		this.vlan_id4 = vlan_id4;
	}

	public String getVlan_id5() {
		return vlan_id5;
	}

	public void setVlan_id5(String vlan_id5) {
		this.vlan_id5 = vlan_id5;
	}

	public String getVlan_id6() {
		return vlan_id6;
	}

	public void setVlan_id6(String vlan_id6) {
		this.vlan_id6 = vlan_id6;
	}

	public String getVlan_id7() {
		return vlan_id7;
	}

	public void setVlan_id7(String vlan_id7) {
		this.vlan_id7 = vlan_id7;
	}

	public String getVlan_id8() {
		return vlan_id8;
	}

	public void setVlan_id8(String vlan_id8) {
		this.vlan_id8 = vlan_id8;
	}

	public String getVlan_id9() {
		return vlan_id9;
	}

	public void setVlan_id9(String vlan_id9) {
		this.vlan_id9 = vlan_id9;
	}

	public String getVlan_id10() {
		return vlan_id10;
	}

	public void setVlan_id10(String vlan_id10) {
		this.vlan_id10 = vlan_id10;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getPon() {
		return pon;
	}

	public void setPon(String pon) {
		this.pon = pon;
	}

	public String getVlan_ger() {
		return vlan_ger;
	}

	public void setVlan_ger(String vlan_ger) {
		this.vlan_ger = vlan_ger;
	}

	public String getOnu_number() {
		return onu_number;
	}

	public void setOnu_number(String onu_number) {
		this.onu_number = onu_number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Onu other = (Onu) obj;
		return Objects.equals(id, other.id);
	}
	
}
