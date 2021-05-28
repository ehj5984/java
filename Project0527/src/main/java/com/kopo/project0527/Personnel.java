package com.kopo.project0527;

public class Personnel {
	int idx;
	String name;
	String gender;
	String address;
	String depart;

	Personnel() {

	}

	Personnel(String name, String gender, String address, String depart) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.depart = depart;
	}

	Personnel(int idx, String name, String gender, String address, String depart) {
		this.idx = idx;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.depart = depart;
	}
}
