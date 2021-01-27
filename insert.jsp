<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>ADD</title>
</head>
<body>
<div id="main-holder">
<h1>Add Patient Details</h1>
<form action="AddController" method="post" >
 <table style="width: 100%" border="1">
    <tr>
     <td>Id</td>
     <td><input type="text" name="id" /></td>
    </tr>
    <tr>
     <td>Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Age</td>
     <td><input type="text" name="age" /></td>
    </tr>
    <tr>
     <td>Mobileno</td>
     <td><input type="text" name="mobileno" /></td>
    </tr>
   </table>
    <input type="submit" value="insert" />
</form>
</div>
</body>
</html>
