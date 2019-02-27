package com.test.gridgame.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rank")
public class Rank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String username;

	@Column(name = "grid_num")
	private int gridNum;

	private long time;

	@Column(name = "create_time")
	private String createTime;

	public Rank() {
	}

	public Rank(int id, String username, int gridNum, long time, String createTime) {
		this.id = id;
		this.username = username;
		this.gridNum = gridNum;
		this.time = time;
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGridNum() {
		return gridNum;
	}
	public void setGridNum(int gridNum) {
		this.gridNum = gridNum;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Rank [id=" + id + ", username=" + username + ", gridNum=" + gridNum + ", time=" + time + ", createTime=" + createTime + "]";
	}

}
