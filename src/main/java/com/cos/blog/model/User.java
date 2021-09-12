package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//ORM=>Java(다른언어) Object -=> 테이블로 매핑해주는 기술

//이어노테이션은 User 클래스가 Mysql에 테이블이 생성이 된다.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
	
	@Id//Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//프로젝트에서 연결된 DB의 넘버링 전략을 따라간ㅌ다.
	private int id; //시퀸스, auto_increment
	
	@Column(nullable = false, length = 30)//nullable 빈공간을 주만 false나게끔 적용
	private String username;
	
	@Column(nullable = false, length = 100)
	private String password;
	  
	@Column(nullable = false, length = 50)
	private String email;
	
	@ColumnDefault("'user'")
	private String role; //Enum을 쓰는게 좋다. 나중에는 이렇게 쓸거임 권한을 주는 항목
	//admin, user, manager 등 권한을 주는 항목
	
	@CreationTimestamp //이 어노테이션은 시간이 자동 입력
	private Timestamp createDate;
	
}
