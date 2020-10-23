<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://"java.sun.com/jsp/jstl/core %>

<jsp:useBean id="entries" scope="session" class="main.java.models.Entries"/>
<c:forEach var="entry" items="${entries.entries}">
    <circle r="5"
            cx=${(entry.x * 2) / entry.r * 50 + 300 / 2}
            cy=${300 / 2 - (entry.y * 2) / entry.r * 50}
            id="target-dot"
            fill=${entry.result ? "green" : "red"}/>
</c:forEach>