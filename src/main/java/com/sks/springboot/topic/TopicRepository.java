package com.sks.springboot.topic;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Serializable> {

}
