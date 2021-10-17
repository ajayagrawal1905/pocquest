package com.quest.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.app.model.Producer;

@Repository
public interface ProducerRepo extends JpaRepository<Producer, Long> {

}
