<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Simple jsp page</title></head>
<body>
<a href="/oneParam.DoMe?paramName=paramVal"> One Url param example, Direct access</a>
<br>
<a href="//OneParam.html"> One Url param example</a>
<br>
<a href="/multipleParams.DoPost?paramName=paramVal"> MultipleParams Url param example, Direct access</a>
<br>
<a href="//MultipleParams.html"> MultipleParams Url param example</a>
<br>
<a href="/forward"> Farword Example (farword to response.jsp)</a>
<br>
<a href="/redirect"> Redirect Example (redirect to confluence.x.lv)</a>
<br>
<a href="/refresh?ref"> Refresh 5 sec</a>
<br>
<a href="/refresh?refred"> Refresh and redirect </a>
<br>
</body>
</html>