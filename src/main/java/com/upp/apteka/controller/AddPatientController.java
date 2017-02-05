package com.upp.apteka.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.upp.apteka.activity.AddPatientActivity;

@Component("addPatient")
public class AddPatientController implements SwingController{
	
	@Autowired
	private ApplicationContext appContext;
	
	public void switchToActivity(Map<String, Object> params){
		AddPatientActivity helloActivity = appContext.getBean(AddPatientActivity.class);
		helloActivity.showActivity();

	}
}