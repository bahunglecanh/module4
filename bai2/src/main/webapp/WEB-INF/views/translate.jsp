<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Từ điển Anh - Việt</title>
</head>
<body>
<h2>Từ điển Anh → Việt</h2>
<form action="translate" method="post">
  <label>Nhập từ tiếng Anh:</label>
  <input type="text" name="word" required/>
  <button type="submit">Dịch</button>
</form>

<c:if test="${not empty result}">
  <hr/>
  <p><b>Kết quả:</b> ${word} → ${result}</p>
</c:if>

</body>
</html>
