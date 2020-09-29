<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="registration" value="/registration"></c:url>
<form:form action="${registration}" commandName="registration">
<table>
<tr>
<td>Id:</td>
<td><form:input path="id"/><font color="red"><form:errors path="id"></form:errors></font></td>
</tr>

<tr>
<td>Name:</td>
<td><form:input path="name"/><font color="red"><form:errors path="name"></form:errors></font></td>
</tr>

<tr>
<td>Password:</td>
<td><form:password path="password"/><font color="red"><form:errors path="password"></form:errors></font></td>
</tr>

<tr>
<td>Email:</td>
<td><form:input type="email" path="email"/><font color="red"><form:errors path="email"></form:errors></font></td>
</tr>

<tr>
<td>Gender:</td>
<td><form:radiobutton path="gender" value="Male"/>Male
<form:radiobutton path="gender" value="Female"/>Female
<form:radiobutton path="gender" value="Others"/>Others
<font color="red"><form:errors path="gender"></form:errors></font></td>
</tr>

<td>Subject</td> 
<td><form:checkbox path="subject" value="C++"/>C++  
<form:checkbox path="subject" value="Java"/>Java  
<form:checkbox path="subject" value="J2EE"/>J2EE
<font color="red"><form:errors path="subject"></form:errors></font></td>
</tr>

<tr>
<td><input type="submit" value="submit"/></td>
</tr>
</table>
</form:form>
</body>
</html>