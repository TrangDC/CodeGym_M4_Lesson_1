<%@ page import="com.example.customer_list.model.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Trang99
  Date: 12/13/2023
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sach khach hang</title>
</head>
<body>
<%
    List<Customer> customers = (List<Customer>) request.getAttribute("customers");
%>
<div>
    There are <%= customers.size() %> customer(s) in list.
</div>

<div>
<h1 style="text-align: center">CustomerList</h1>
</div>

<div>
    <table border="1">
        <caption>Customers List</caption>
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="c" items="${requestScope.customers}">
            <tr>
                <td>
                    <c:out value="${c.id}"/>
                </td>
                <td>
                    <a href="customer/${c.id}">${c.name}</a>
                </td>
                <td>
                    <c:out value="${c.email}"/>
                </td>
                <td>
                    <c:out value="${c.address}"/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
