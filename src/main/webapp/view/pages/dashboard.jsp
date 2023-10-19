<jsp:include page="/view/layout/head.jsp" />
  <jsp:include page="/view/layout/nav.jsp" />
<h1/>Dashboard</h1>
<%
out.println("java code here");

int a = 1;
int b = 2;

if(a > b) out.println("a > b");
else out.println("a < b");

%>

<jsp:include page="/view/layout/footer.jsp" />
