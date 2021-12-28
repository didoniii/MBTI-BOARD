package com.ch.mbti.model;

import java.sql.Date;
import lombok.Data;

@Data
public class Member {
	private String id;			// 아이디
	private String mbti;		// MBTI
	private String password;	// 비밀번호
	private String email;		// 이메일
	private String del;			// 삭제여부
	private Date regdate;		// 등록날짜
} 
