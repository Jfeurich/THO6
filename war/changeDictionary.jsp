<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="nl">
<body>
<div id="container">
  <jsp:include page="Header.jsp">
    <jsp:param name="subTitle" value="Change Dictionary" />
  </jsp:include>
  <div class="content">
    <jsp:include page="Menu.jsp" />
    <div class="messageBox">${message}</div>

    <form action="changeDictionary.do" method="post">
    <%--TODO elementvalue--%>
    <c:forEach items="${sessionScope.elements}" var="element">
      <label>&lt;${element}&gt;</label> = <input type="text" name="${element}" value="${elementvalue}">
    </c:forEach>
      <input type="submit" value="Submit">
    </form>
    <jsp:include page="Footer.jsp" />
  </div>
</div>
</body>
</html>
