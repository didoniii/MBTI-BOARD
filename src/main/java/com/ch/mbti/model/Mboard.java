package com.ch.mbti.model;

import java.sql.Date;
import lombok.Data;

@Data
public class Mboard {
	private int mbo_no;			// MBTI 게시글 번호
	private String id;			// 아이디
	private String mbti;		// MBTI
	private String subject;		// 제목
	private String content;		// 내용
	private String img;			// 첨부사진
	private int likes;			// 좋아요
	private int r_count;		// 조회수
	private int report;			// 신고
	private String del;			// 삭제여부
	private Date regdate;		// 등록날짜
	
	// paging용
    private int startRow;
    private int endRow;
    
    //검색용
    private String keyword;
    private String search;
}
