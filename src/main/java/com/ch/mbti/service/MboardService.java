package com.ch.mbti.service;

import java.util.List;

import com.ch.mbti.model.Mboard;

public interface MboardService {
	
	List<Mboard> mbList(Mboard mboard); 	// MBTI 게시글 리스트
	int getTotal(Mboard mboard); 			// 총 MBTI 게시글 수
	int insert(Mboard mboard);				// MBTI 게시글 작성
	int maxMbo_no();						// 새로운 MBTI 게시글 번호 
	Mboard select(int mbo_no);				// MBTI 게시글 상세보기
	int update(Mboard mboard);				// MBTI 게시글 수정
	int delete(int mbo_no);				// MBTI 게시글 삭제
	
}


