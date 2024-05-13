<%--
  Created by IntelliJ IDEA.
  User: raajs
  Date: 5/12/2024
  Time: 7:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3> Improt Excel File</h3>
    <form action = "${pageContext.request.contextPath}/product/import" method = "post" enctype="multipart/form-data"></form>
    <input type="file" name="user.jsp">

</form>

</body>
</html>
