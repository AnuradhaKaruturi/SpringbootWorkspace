package com.spring.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")                           //http://localhost:1975/topics
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();         
	}
	
	@GetMapping("/topics/id/{id}")                           //http://localhost:1975/topics/id/102
	public Topic getTopicsById(@PathVariable String id) {
		return topicService.getTopicsById(id);         
	}
	
	@GetMapping("/topics/name/{name}")                           //http://localhost:1975/topics/name/Java
	public Topic getTopicsByName(@PathVariable String name) {
		return topicService.getTopicsByName(name);         
	}

	@PostMapping("/topics/new")
	public void addTopic(@RequestBody Topic  topics) {             //http://localhost:1975/topics/new  --> add new record in body of POST request of postman
		topicService.addTopic(topics);	
	}
	
	@PutMapping("/topics/update/{id}")
	public void updateTopic(@RequestBody Topic  topics,@PathVariable String id) {             //http://localhost:1975/topics/update/103 --> update existing record in body of PUT request of postman
		topicService.updateTopic(topics , id);	
	}
	
	@DeleteMapping("/topics/delete/{id}")                           //http://localhost:1975/topics/delete/102
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);         
	}
}