package com.test.gridgame;

import com.test.gridgame.entity.Rank;
import com.test.gridgame.service.RankService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AndroidGridgameApplicationTests {

	@Autowired
	RankService rankService;

	@Test
	public void testAdd() {
		Rank rank = new Rank();
		rank.setUsername("a");
		rank.setGridNum(3);
		rank.setTime(50);
		rankService.add(rank);
	}

	@Test
	public void testGetList() {
		List<Rank> list = rankService.getList();
		for (Rank rank : list) {
			System.out.println(rank);
		}
	}

}
