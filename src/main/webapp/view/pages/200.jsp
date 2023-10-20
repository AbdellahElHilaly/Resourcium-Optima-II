<jsp:include page="/view/layout/head.jsp" />

<div
  class="bg-success vh-100 d-flex flex-column align-items-center justify-content-center"
>
  <div class="d-flex align-items-center">
    <jsp:include page="/view/widget/animation/success.jsp" />
  </div>
  <p class="mt-4"><%= request.getAttribute("message") %></p>
  <div class="button-container mt-4">
    <a href="Router?page=home" class="btn btn-primary mr-3">Home</a>
    <% if ("login".equals(request.getAttribute("next"))) { %>
    <a href="Router?page=login" class="btn btn-secondary">Login</a>
    <% } %>
  </div>
</div>

<jsp:include page="/view/layout/footer.jsp" />
