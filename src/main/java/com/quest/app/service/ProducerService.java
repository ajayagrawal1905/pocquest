package com.quest.app.service;

import java.util.List;

import com.quest.app.model.Producer;

public interface ProducerService {

	Object saveProducer(Producer producer);

	List<Producer> getAllProdeucer();

}
