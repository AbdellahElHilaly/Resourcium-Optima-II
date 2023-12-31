<jsp:include page="/view/layout/head.jsp" />

<div
  class="bg-danger vh-100 d-flex flex-column align-items-center justify-content-center"
>
  <div class="d-flex align-items-center">
    <jsp:include page="/view/widget/animation/error.jsp" />
  </div>
  <p class="mt-4"><%= request.getAttribute("error") %></p>
  <div class="button-container mt-4">
    <a href="Router?page=home" class="btn btn-primary mr-3">Home</a>
    <% if ("login".equals(request.getAttribute("next"))) { %>
    <a href="Router?page=login" class="btn btn-secondary">Login</a>
    <% } else if ("register".equals(request.getAttribute("next"))) { %>
    <a href="Router?page=register" class="btn btn-success">Register</a>
    <% } %>
  </div>
</div>

<jsp:include page="/view/layout/footer.jsp" />
