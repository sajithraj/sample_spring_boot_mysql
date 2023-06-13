package com.srsprintboot.sample.sr;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DBRepository {

	private static final String QUERY_Where = "SELECT id , type , symbol FROM instruments WHERE id = ? ; ";
	private static final String QUERY = "SELECT type FROM instruments ";

	@Autowired
	private JdbcTemplate jdbc;

	public List<String> getVal() {

		List<String> respList = new ArrayList<>();
		respList.addAll(jdbc.queryForList(QUERY, String.class));

		return respList;

//		jdbc.queryForList(QUERY, 1);
//		return respList.get(0);
	}

	public Map<String, Object> getVal_sr(String id) {

		List<Map<String, Object>> respList = jdbc.queryForList(QUERY_Where, id);
		return respList.get(0);
	}
}
