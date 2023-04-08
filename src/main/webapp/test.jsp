<%--
  Created by IntelliJ IDEA.
  User: tffide
  Date: 4/3/23
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<header style="padding: 100px 0; background: url('img/sands.png') no-repeat center center fixed; background-size: cover; height: 400px;"></header>
<footer style="padding: 50px 0; background: url('img/sands.png') no-repeat center center fixed; background-size: cover; height: 400px;"></footer>
<body>
<section>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach items="${quests}" var="quest" >
            <tr>
                <td>Quest ID: <c:out value="${quest.id}"/></td>
                <td>Quest name: <c:out value="${quest.name}"/></td>
            </tr>
        </c:forEach>
    </table>
</section>

</body>
</html>
