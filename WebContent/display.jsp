<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.login.model.Login"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Details</title>
</head>
<style>
    table, th, td {
        padding: 1%;
    }
</style>
<div>
    <h1 style="text-align: center">Displaying Login Details</h1>
    <table border="1" width="65%" align="center">
        <tr bgcolor="00FF7F">
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Password</th>
            <th>Age</th>
            <th>Date of Birth</th>
            <th>Address</th>
        </tr>
        <%ArrayList<Login> log = (ArrayList<Login>)request.getAttribute("data");
        for(Login l:log){%>
        <%-- Arranging data in tabular form
        --%>
        <tr>
            <td><%=l.getFirstName()%></td>
            <td><%=l.getLastName()%></td>
            <td><%=l.getEmail()%></td>
            <td><%=l.getPhoneNumber()%></td>
            <td><%=l.getUserName()%></td>
            <td><%=l.getAge()%></td>
            <td><%=l.getDob()%></td>
            <td><%=l.getAddr1()%><%=l.getAddr2()%><%=l.getAddr3()%></td>
        </tr>
        <%}%>
    </table>
</div>
</html>