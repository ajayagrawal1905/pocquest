package com.quest.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quest.app.model.Producer;
import com.quest.app.service.ProducerService;

@RestController
@RequestMapping("/api")
public class PocController {
	
	@Autowired
	ProducerService producerService;
	
	@GetMapping("/v1/hello")
	public String demo() {
		return "hello,world";
	}
	
	@PostMapping("/v1/producer")
	public ResponseEntity<?> saveProducer(@RequestBody Producer producer){
		Object prod = null;
		try {
			prod = producerService.saveProducer(producer);
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Server Error",HttpStatus.NOT_IMPLEMENTED);
		}
	}
	
	@GetMapping("/v1/producer")
	public ResponseEntity<List<Producer>> getProducerList(){
		List<Producer> producerList = null;
		try {
			producerList = producerService.getAllProdeucer();
			return new ResponseEntity<List<Producer>>(producerList,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Producer>>(HttpStatus.NOT_IMPLEMENTED);
		}
		
	}

}
