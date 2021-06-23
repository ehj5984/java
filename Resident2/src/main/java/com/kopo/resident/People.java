package com.kopo.resident;


	public class People {
		int idx;
		String name;
		String age;
		String gender;
		String created;
		String updated;
		
		People() {
			
		}
		
		People(String name, String age, String gender, String created, String updated) {
		
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.created = created;
			this.updated = updated;
		}
		
		People(int idx, String name, String age, String gender, String created, String updated) {
			this.idx = idx;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.created = created;
			this.updated = updated;
		}
	}
