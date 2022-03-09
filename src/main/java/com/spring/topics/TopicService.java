package com.spring.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("101","Java","programming language"),
			new Topic("102","CPP","programming language"),
			new Topic("103","OS","operating system"),
			new Topic("104","Angular","User Interface")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
		
	}

	public Topic getTopicsById(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public Topic getTopicsByName(String name) {
		return topics.stream().filter(t->t.getName().equals(name)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		
		topics.add(topic);
	}

	
	public void updateTopic(Topic topic, String id) {
		for(int i = 0 ; i < topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}

	
	

}
