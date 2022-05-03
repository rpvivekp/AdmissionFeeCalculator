package com.service;

import org.springframework.stereotype.Service;

import com.model.Admission;

//use appropriate annotation to configure AdmissionService as Service
@Service
public class AdmissionService {
	
	public double calculateAdmissionFees(Admission obj)
	{
		double admissionFees=0.0;
		//fill the code		
		if(obj.getDeptName().equalsIgnoreCase("EEE"))
 		{
 			obj.setTuitionFees(45000.00);
 		}
 		else if(obj.getDeptName().equalsIgnoreCase("ECE"))
 		{
 			obj.setTuitionFees(50000.00);
 		}
 		else
 		{
 			obj.setTuitionFees(60000.00);
 		}
 				
 		if(obj.getDeptName().equalsIgnoreCase("EEE"))
 		{
 			if(obj.getPreferHostel().equalsIgnoreCase("Yes"))
 			{
 				if(obj.getFirstGraduateInfo().equalsIgnoreCase("Yes"))
 				{
 					admissionFees=obj.getTuitionFees()+75000.00;
 				}
 				else
 				{
 					admissionFees=obj.getTuitionFees()+75000.00+20000.00;
 				}	 	  	    	    		        	 	
 			}
 			else
 			{
 				if(obj.getFirstGraduateInfo().equalsIgnoreCase("Yes"))
 				{
 					admissionFees=obj.getTuitionFees();
 				}
 				else
 				{
 					admissionFees=obj.getTuitionFees()+20000.00;
 				}
 			}
 		}
 		else if(obj.getDeptName().equalsIgnoreCase("ECE"))
 		{
 			if(obj.getPreferHostel().equalsIgnoreCase("Yes"))
 			{
 				if(obj.getFirstGraduateInfo().equalsIgnoreCase("Yes"))
 				{
 					admissionFees=obj.getTuitionFees()+75000.00;
 				}
 				else
 				{
 					admissionFees=obj.getTuitionFees()+75000.00+25000.00;
 				}
 			}
 			else
 			{
 				if(obj.getFirstGraduateInfo().equalsIgnoreCase("Yes"))
 				{
 					admissionFees=obj.getTuitionFees();
 				}
 				else
 				{
 					admissionFees=obj.getTuitionFees()+25000.00;
 				}	 	  	    	    		        	 	
 			}
 		}
 		
 		else
 		{
 			if(obj.getPreferHostel().equalsIgnoreCase("Yes"))
 			{
 				if(obj.getFirstGraduateInfo().equalsIgnoreCase("Yes"))
 				{
 					admissionFees=obj.getTuitionFees()+75000.00;
 				}
 				else
 				{
 					admissionFees=obj.getTuitionFees()+75000.00+30000.00;
 				}
 			}
 			else
 			{
 				if(obj.getFirstGraduateInfo().equalsIgnoreCase("Yes"))
 				{
 					admissionFees=obj.getTuitionFees();
 				}
 				else
 				{
 					admissionFees=obj.getTuitionFees()+30000.00;
 				}
 			}
 		}

		return admissionFees;
	}

}
