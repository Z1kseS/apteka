package com.upp.apteka.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.upp.apteka.activity.Activity;

@Component("addDoctor")
public class AddDoctorController implements SwingController{
	
	@Autowired
	private ApplicationContext appContext;
	
	public void switchToActivity(Map<String, Object> params){
		Activity addDoctorActivity = (Activity) appContext.getBean("addDoctorActivity");
		addDoctorActivity.showActivity(new HashMap<String, Object>());

	}
}
