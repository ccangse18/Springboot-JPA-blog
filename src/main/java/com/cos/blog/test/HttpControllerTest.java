package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//이 어노테이션은 인터넷브라우저 요청으로 get방식으로만 하여야 한다.
public class HttpControllerTest {

	private static final String TAG="HttpControllerTest";
	
	@GetMapping("/http/get")
	public String getTest(Member m) {
		System.out.println(TAG+"getter:"+m);
		//빌더어노테이션을 하면 쓸수 있는 경우
		Member m1 = Member.builder().id(10).email("ccangse18@naver.com").build();
		System.out.println(TAG+"getter:"+m1);
		return "get 요철"+m1.getId()+m1.getUsername()+m1.getEmail();
	}
}
