<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

    <h1>Home Page</h1>

    <h6>Page: ${page}</h6>

    <% for (int i = 0; i < 3; i++) { %>
        <h4> ${message} <%= i %></h4>
    <% } %>

</body>
</html>