package com.test.gridgame.controller;

import java.util.List;

import com.test.gridgame.entity.Rank;
import com.test.gridgame.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("rank")
@Controller
public class RankController {
	
	@Autowired
	private RankService rankService;
	
	@RequestMapping("add")
	@ResponseBody
	public String add(Rank rank){
		rankService.add(rank);
		return "success";
	}
	
	@RequestMapping("getList")
	@ResponseBody
	public List<Rank> getList(){
		return rankService.getList();
	}
	
}
