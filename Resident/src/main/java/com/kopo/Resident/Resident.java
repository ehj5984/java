package com.kopo.Resident;

public class Resident {
	int idx;
	String name;
	String age;
	String gender;
	String created;
	String updated;
	
	Resident(){
		
	}
	
	Resident(String name, String age, String gender, String created, String updated){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.created = created;
		this.updated = updated;
		
	}

	Resident(int idx, String name, String age, String gender, String created, String now){
		this.idx = idx;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.created = created;
		this.updated = now;
	
	}
}
