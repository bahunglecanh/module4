<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Chuyển đổi USD → VNĐ</h2>
<form action="convert" method="post">
    <label>Tỉ giá (1 USD = ? VNĐ):</label>
    <input type="text" name="rate" required/><br/><br/>

    <label>Nhập số USD:</label>
    <input type="text" name="usd" required/><br/><br/>

    <button type="submit">Convert</button>
</form>

<%-- Nếu có kết quả thì hiển thị --%>
<c:if test="${not empty vnd}">
    <hr/>
    <h3>Kết quả</h3>
    <p>Tỉ giá: ${rate} VNĐ</p>
    <p>Số USD: ${usd}</p>
    <p><b>Thành tiền: ${vnd} VNĐ</b></p>
</c:if>

</body>
</html>
