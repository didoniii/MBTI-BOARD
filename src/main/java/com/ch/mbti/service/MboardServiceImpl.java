package com.ch.mbti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ch.mbti.dao.MboardDao;
import com.ch.mbti.model.Mboard;

@Service
public class MboardServiceImpl implements MboardService {
	@Autowired
	private MboardDao mbd;
	
	public List<Mboard> mbList(Mboard mboard) {
		return mbd.mbList(mboard);
	}
	public int getTotal(Mboard mboard) {
		return mbd.getTotal(mboard);
	}
	public int insert(Mboard mboard) {
		return mbd.insert(mboard);
	}
	public int maxMbo_no() {
		return mbd.maxMbo_no();
	}
	public Mboard select(int mbo_no) {
		return mbd.select(mbo_no);
	}
	public int update(Mboard mboard) {
		return mbd.update(mboard);
	}
	public int delete(int mbo_no) {
		return mbd.delete(mbo_no);
	}
}
