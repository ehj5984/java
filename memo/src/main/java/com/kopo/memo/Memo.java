package com.kopo.memo;

public class Memo {
	int idx;
	String title;
	String content ;
	String created;
	String updated;
	int userIdx ;
	
	Memo (){
		
	}
	
	Memo(String title , String content , String created , String now, int userIdx){
		this.title = title;
		this.content = content;
		this.created = created;
		this.updated = now;
		this.userIdx = userIdx;
		
	}
	
	Memo ( int idx, String title , String content, String created, String now){
		this.title = title;
		this.content = content;
		this.created = created;
		this.updated = now;
		this.idx = idx;
	}
}
