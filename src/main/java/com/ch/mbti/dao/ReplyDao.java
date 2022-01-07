package com.ch.mbti.dao;

import java.util.List;

import com.ch.mbti.model.Reply;

public interface ReplyDao {

	List<Reply> rpList(int mbo_no);
	int insert(int mbo_no);

}
