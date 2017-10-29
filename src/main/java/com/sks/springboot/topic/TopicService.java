package com.sks.springboot.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getTopicList() {
		List<Topic> topicList = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}

	public Topic getTopicById(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic t) {
		topicRepository.save(t);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}

	public void updateTopic(Topic t) {
		topicRepository.save(t);
	}
}
