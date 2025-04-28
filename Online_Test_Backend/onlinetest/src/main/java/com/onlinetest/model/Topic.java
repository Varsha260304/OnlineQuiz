package com.onlinetest.model;

public class Topic {
	private int id;
    private int catId;
    private String topic;

    // Constructors, getters, and setters

    public Topic() {
    }

    public Topic(int id, int catId, String topic) {
        this.id = id;
        this.catId = catId;
        this.topic = topic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatId() {
        return catId;
    }
    
    public void setCatId(int catId) {
        this.catId = catId;
    }
    
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
 
}
