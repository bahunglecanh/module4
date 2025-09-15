
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Sandwich Condiments</title>
</head>
<body>
<h2>Chọn gia vị cho Sandwich của bạn:</h2>
<form action="save" method="post">
  <c:forEach var="c" items="${condiments}">
    <input type="checkbox" name="condiment" value="${c.id}"/> ${c.name} <br/>
  </c:forEach>
  <input type="submit" value="Save"/>
</form>
</body>
</html>

