package com.example.springrest.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.springrest.entity.Activity;
import com.example.springrest.entity.ActivityRepository;
import com.example.springrest.services.ActivityService;

@Component
public class ActivityServiceImpl implements ActivityService {
@Autowired
ActivityRepository activtyRepository;
	
@Transactional(readOnly = false,propagation = Propagation.REQUIRES_NEW)
@Override
	public void logActivity(Activity activity) {
		
		activtyRepository.save(activity);
		
	}

}
