
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Kết quả</title>
</head>
<body>
<h2>Bạn đã chọn:</h2>
<c:if test="${empty selectedCondiments}">
  <p>Không có gia vị nào được chọn.</p>
</c:if>
<c:if test="${not empty selectedCondiments}">
  <ul>
    <c:forEach var="c" items="${selectedCondiments}">
      <li>${c.name}</li>
    </c:forEach>
  </ul>
</c:if>

<a href="<c:url value='/'/>">Quay lại chọn tiếp</a>
</body>
</html>

