package com.ch.mbti.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ch.mbti.model.Mboard;

@Repository
public class MboardDaoImpl implements MboardDao{
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<Mboard> list(Mboard mboard) {
		return sst.selectList("mboardns.mbList");
	}
	public int getTotal(Mboard mboard) {
		return sst.selectOne("mboardns.getTotal");
	}
	public int insert(Mboard mboard) {
		return sst.insert("mboardns.insert", mboard);
	}
	public int maxMbo_no() {
		return sst.selectOne("mboardns.maxMbo_no");
	}
	public Mboard select(int mbo_no) {
		return sst.selectOne("mboardns.select");
	}
	
	
}
