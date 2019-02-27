package com.test.gridgame.dao;

import com.test.gridgame.entity.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankDao extends JpaRepository<Rank, Integer> {
	
	@Query("select r from Rank r order by grid_num desc, time asc, create_time desc")
	List<Rank> getList();
	
}
