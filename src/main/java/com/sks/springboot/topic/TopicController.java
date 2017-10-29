package com.sks.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getTopicList() {
		System.out.println("List of Topics");
		return topicService.getTopicList();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id) {
		System.out.println("Topic Detail , id= " + id);
		return topicService.getTopicById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic t) {
		System.out.println("Create Topic");
		topicService.addTopic(t);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		System.out.println("Delete Topic, id= " + id);
		topicService.deleteTopic(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics")
	public void updateTopic(@RequestBody Topic t) {
		System.out.println("Update Topic");
		topicService.updateTopic(t);
	}
}
