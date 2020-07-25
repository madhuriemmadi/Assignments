package com.example.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "LOG_ACTIVITY")
public class Activity {
	@Id
	@GeneratedValue
	long id;

	@Column(name ="log_message")
	@NotNull
	private String logMessage;
	
	@NotNull
	@Column(name ="ACT_TYPE")
	private String activityType ;
	
	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Activity [logMessage=" + logMessage + "]";
	}
	
	
}
