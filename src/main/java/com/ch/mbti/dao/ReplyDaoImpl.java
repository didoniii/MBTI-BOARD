package com.ch.mbti.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.mbti.model.Reply;

@Repository
public class ReplyDaoImpl implements ReplyDao{
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<Reply> rpList(int mbo_no) {
		return sst.selectList("replyns.rpList",mbo_no);
	}
	public int insert(int mbo_no) {
		return sst.insert("replyns.insert",mbo_no);
	}
		
}
