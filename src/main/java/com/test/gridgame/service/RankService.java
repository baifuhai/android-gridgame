package com.test.gridgame.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.test.gridgame.dao.RankDao;
import com.test.gridgame.entity.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankService {
	
	@Autowired
	private RankDao rankDao;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public void add(Rank rank){
		rank.setCreateTime(sdf.format(new Date()));
		rankDao.save(rank);
	}
	
	public List<Rank> getList(){
		return rankDao.getList();
	}
	
}
