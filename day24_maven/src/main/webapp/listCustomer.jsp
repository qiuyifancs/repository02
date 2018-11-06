<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListCustomer</title>
</head>
<body>
<table align="center" border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>male</th>
        <th>birthday</th>
        <th>town</th>
        <th>phone</th>
        <th>email</th>
    </tr>

    <c:forEach items="${sessionScope.customers}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.male}</td>
            <td>${customer.birthday}</td>
            <td>${customer.town}</td>
            <td>${customer.phone}</td>
            <td>${customer.email}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
