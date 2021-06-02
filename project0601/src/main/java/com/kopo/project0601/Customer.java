package com.kopo.project0601;

public class Customer {
	int idx;
	String id;
	String pwd ;
	String name;
	String birthday;
	String address;
	String created;
	String updated;
	
	Customer() {

	}

	Customer(String id,String pwd, String name, String birthday, String address) {
		this.name = name;
		this.id =  id;
		this.pwd = pwd ;
		this.name =  name ;
		this.birthday = birthday;
		this.address = address;
		
	}

	Customer(int idx,String id,String pwd, String name, String birthday, String address) {
		this.idx = idx;
		this.name = name;
		this.id =  id;
		this.pwd = pwd ;
		this.name =  name ;
		this.birthday = birthday;
		this.address = address;
		
	}
}
