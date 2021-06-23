package com.kopo.memo;

public class User {
	String idx;
	String id;
	String pwd;
	String name;
	String birthday;
	String address;
	String joindate;

	User() {

	}

	// 회원가입 할겨
	User(String id, String pwd, String name, String birthday, String address, String joindate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.joindate = joindate;

	}

	// 로그인
	User(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;

	}

}