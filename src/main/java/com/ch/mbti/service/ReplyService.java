package com.ch.mbti.service;

import java.util.List;

import com.ch.mbti.model.Reply;

public interface ReplyService {

	List<Reply> rpList(int mbo_no);			// 댓글 불러오기
	int insert(int mbo_no);			// 댓글 게시
	

}
