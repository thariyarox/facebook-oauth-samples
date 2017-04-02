<%@ page import="org.json.simple.parser.JSONParser" %>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="com.google.gson.Gson" %>
<%@ page import="com.google.gson.GsonBuilder" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<pre>
<%
    String user_resource = (String) request.getAttribute("user_resource");

    JSONParser parser = new JSONParser();
    Object obj = parser.parse(user_resource);
    JSONObject jsonobj = (JSONObject) obj;


    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String output = gson.toJson(jsonobj);

    System.out.println(output);
%>

<%=output%>

</pre>

</body>
</html>
