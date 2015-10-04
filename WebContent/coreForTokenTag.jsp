<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Example c:forTokens tag in JSTL</title>
</head>
<body>
<c:forTokens items="www.beginnersbook.com" delims="." var="site" >
 <c:out value="${site}"/>
</c:forTokens>
</body>
</html>