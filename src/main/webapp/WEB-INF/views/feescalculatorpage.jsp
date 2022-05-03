<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Admission Fees Calculator </center></h1>
<form:form method="post" action="result" modelAttribute="admission">
 
 <table style="margin: 0px auto; margin-left: auto; margin-right:auto">
 		    <tr>
 			<td>Enter Admission ID</td><td><form:input path="admissionId" id="admissionId"/></td><td><form:errors path="admissionId"/></tr>
 			<tr>      
 			<tr>
 				<td>Choose Department:</td>
 				<td>
 				 <form:select path="deptName" id="deptName">
 						<form:options items="${deptNameList}"/>
 					</form:select>	
 					
 				</td>
 			</tr>
 						
 			<tr>
 				<td>Hostel Preference:</td>
 				<td>
 				 <form:select path="preferHostel" id="preferHostel">
 						<form:options items="${preferenceList}"/>
 					</form:select>	
 					
 				</td>
 			</tr>
 			
 			<tr>
 				<td>Are you first graduate in your family:</td>
 				<td>
 				 <form:select path="firstGraduateInfo" id="firstGraduateInfo">
 						<form:options items="${graduateList}"/>
 					</form:select>	
 					
 				</td>
 			</tr>
 			<tr>
 				<td><input type="submit" value="CalculateFees" id="submit" /></td>
 				<td><input type="reset" value="Cancel"/></td>
 			</tr>
 			
 		</table>
</form:form>


</body>
</html>	 	  	    	    	     	      	 	
