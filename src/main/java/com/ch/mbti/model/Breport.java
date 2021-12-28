package com.ch.mbti.model;

import lombok.Data;

@Data
public class Breport {
	private int bore_no;		// 게시글 신고 번호
	private int mbo_no;			// MBTI 게시글 번호
	private String id;			// 아이디
	private String content;		// 내용
	private String del;			// 삭제여부
}
