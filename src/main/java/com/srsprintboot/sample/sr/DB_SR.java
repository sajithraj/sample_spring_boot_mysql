package com.srsprintboot.sample.sr;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DB_SR {

	private static final String QUERY = "SELECT id , type , symbol FROM instruments WHERE id = ?";

	@Autowired
	private JdbcTemplate jdbc;

	public Map<String, Object> getVal() {

		List<Map<String, Object>> respList = jdbc.queryForList(QUERY, 1);
		return respList.get(0);
	}

}
