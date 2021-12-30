package com.ch.mbti.dao;

import java.util.List;
import com.ch.mbti.model.Mboard;

public interface MboardDao {
	
	
	List<Mboard> list(Mboard mboard);
	int getTotal(Mboard mboard);
	int insert(Mboard mboard);
	int maxMbo_no();
	Mboard select(int mbo_no);
	
}
