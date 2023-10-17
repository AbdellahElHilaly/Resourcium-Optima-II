
<jsp:include page="/WEB-UI/layout/head.jsp" />

<div class="container">
    <h2>Authentication</h2>
    <c:choose>
        <c:when test="${param.page == 'register'}">
            <jsp:include page="/WEB-UI/components/user/register.jsp" />
        </c:when>

        <c:when test="${param.page == 'login'}">
            <jsp:include page="/WEB-UI/components/user/login.jsp" />
        </c:when>

        <c:otherwise>
            <jsp:include page="/WEB-UI/components/user/login.jsp" />
        </c:otherwise>

    </c:choose>
</div>

<jsp:include page="/WEB-UI/layout/footer.jsp" />
