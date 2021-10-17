package com.quest.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quest.app.model.Producer;
import com.quest.app.repository.ProducerRepo;

@Service
public class ProducerServiceImpl implements ProducerService {
	
	@Autowired
	ProducerRepo producerRepo;
	
	@Override
	@Transactional
	public Object saveProducer(Producer producer) {
		return producerRepo.save(producer);
	}

	@Override
	public List<Producer> getAllProdeucer() {
		
		return producerRepo.findAll();
	}

}
