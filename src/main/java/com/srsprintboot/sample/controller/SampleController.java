package com.srsprintboot.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srsprintboot.sample.sr.DBRepository;
import com.srsprintboot.sample.sr.DB_SR;

@RestController
@RequestMapping("/api")
public class SampleController {

	@Autowired
	DBRepository dbrepo;

	@GetMapping("/cif")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

	@GetMapping("/cif/{acct}")
//	public ResponseEntity<String> get_account_details(@PathVariable(value = "acct") String account) {
	public ResponseEntity<Object> get_account_details(@PathVariable(value = "acct") String account) {
		System.out.println("account " + account);
		Map<String, Object> map = new HashMap<>();
		map.put("status", "SUCCESS");
		map.put("account", account);
		map.put("cif", 11111111);

		return new ResponseEntity<Object>(map, HttpStatus.OK);
//		return new ResponseEntity<String>("Hello " + account, HttpStatus.OK);
	}

	@GetMapping("/test/{id_sr}")
	public ResponseEntity<Object> get_id_details(@PathVariable(value = "id_sr") String id_sr) {
		System.out.println("id " + id_sr);
		Map<String, Object> map = dbrepo.getVal_sr(id_sr);
		map.put("status", "SUCCESS");
		return new ResponseEntity<Object>(map, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public List<String> get_id_details_test(@PathVariable(value = "id") String id) {
		System.out.println("id " + id);
		return dbrepo.getVal();

	}

}
