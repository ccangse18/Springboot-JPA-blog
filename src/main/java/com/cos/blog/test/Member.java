package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//date어노테이션은 겟터셋터를 대신 해주는 것
//@AllArgsConstructor
//allargsconstructor 은 생성자를 만들어 주는것
@NoArgsConstructor
//이 어노테이션은 빈생성자를 만들어 주는것
public class Member {
	
	private int id;
	private String username;
	private String email;
	
	@Builder
	//builder어노테이션은 생성자 하나만 만들어도 들어 오는 데이터 하나가 들어와도 쓸수있게 한다.
	public Member(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
	
}
