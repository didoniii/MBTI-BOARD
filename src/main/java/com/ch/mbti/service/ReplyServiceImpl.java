package com.ch.mbti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ch.mbti.dao.ReplyDao;
import com.ch.mbti.model.Reply;

@Service
public class ReplyServiceImpl implements ReplyService{
	@Autowired
	private ReplyDao rd;

	public List<Reply> rpList(int mbo_no) {
		return rd.rpList(mbo_no);
	} 
	public int insert(int mbo_no) {
		return rd.insert(mbo_no);
	}

}
