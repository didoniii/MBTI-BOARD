package com.ch.mbti.model;

import lombok.Data;

@Data
public class Rreport {
	private int rere_no;		// 댓글 신고 번호
	private int re_no;			// 댓글 번호
	private String id;			// 아이디
	private String content;		// 내용
	private String del;			// 삭제여부
}
