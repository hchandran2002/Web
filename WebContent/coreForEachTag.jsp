<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Example c:forEach tag in JSTL</title>
</head>
<body>
<c:forEach var="counter" begin="1" end="10">
 <c:out value="${counter}"/>
</c:forEach>
</body>
</html>