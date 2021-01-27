<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Admin Login</title>
</head>
<body>
<span>${ref}</span>
<div id="main-holder">
  <h1>Admin Login Form</h1>
  <form action="<%=request.getContextPath()%>/Login" method="post" id="login-form">
   <table style="with: 100%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username"/></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit"/>
  </form>
 </div>
  
</body>
</html>