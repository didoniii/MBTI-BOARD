package com.ch.mbti.model;

import java.sql.Date;
import lombok.Data;

@Data
public class Qboard {
	private int qbo_no;			// 질문 게시글 번호
	private String id;			// 아이디
	private String mbti;		// MBTI
	private String subject;		// 제목
	private String content;		// 내용
	private String del;			// 삭제여부
	private Date regdate;		// 등록날짜
	private int ref;			// 참조 게시글 번호
	private int re_step;		// 답글 순서
	private int re_level;		// 게시글 들여쓰기 레벨
	
	// paging용
    private int startRow;
    private int endRow;
    
    //검색용
    private String keyword;
    private String search;
}
