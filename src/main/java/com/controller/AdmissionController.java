package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Admission;
import com.service.AdmissionService;

@Controller
public class AdmissionController {
	
	@Autowired
 	private AdmissionService service;
 	
 	@RequestMapping(value = "/feesCalculatorPage", method = RequestMethod.GET)
 	public String feesCalculatorPage (@ModelAttribute("admission") Admission admission)
 	{
 		return "feescalculatorpage";
 	}
 	@ModelAttribute("deptNameList")
 	public  Map<String, String> buildState(){
 		
 		Map<String, String> serviceMap = new HashMap<String, String>();
 		serviceMap.put("EEE", "EEE");
 		serviceMap.put("ECE", "ECE");
 		serviceMap.put("CSE", "CSE");
 		return serviceMap;                     
 	}	 	  	    	    		        	 	
 	
 	@ModelAttribute("preferenceList")
 	public  Map<String, String> getHostelPreference(){
 		
 		Map<String, String> serviceMap = new HashMap<String, String>();
 		serviceMap.put("YES", "YES");
 		serviceMap.put("NO", "NO");
 		return serviceMap;                     
 	}
 	
 	@ModelAttribute("graduateList")
 	public  Map<String, String> getFirstGraduateInfo(){
 		
 		Map<String, String> serviceMap = new HashMap<String, String>();
 		serviceMap.put("YES", "YES");
 		serviceMap.put("NO", "NO");
 		return serviceMap;                     
 	}
 	
 	@RequestMapping(value = "/result", method = RequestMethod.POST)
 	public String calculateAdmissionFees(@Valid @ModelAttribute("admission") Admission admission, 
 			BindingResult result,ModelMap map)
 	{
 		if(result.hasErrors()) {
 			return "feescalculatorpage";
 	}
 		else
 		{
 		double cost=service.calculateAdmissionFees(admission);
 		map.addAttribute("cost",cost);
 		return "result";
 		
 		}		
 	}
 
}
