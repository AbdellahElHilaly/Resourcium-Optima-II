<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/fmt" %>


<section class="container my-5">
  <h2 class="text-center mb-4">Explore Departments</h2>
  <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-lg-4 g-4">
    <c:forEach var = "i" begin = "1" end = "4">
      <div class="col">
        <div class="text-center">
          <img
            src="https://mdbcdn.b-cdn.net/img/new/standard/city/047.webp"
            class="img-fluid rounded-pill"
            alt="Townhouses and Skyscrapers"
          />
          <h5 class="mt-3">Department ${i}</h5>
        </div>
      </div>
    </c:forEach>
  </div>
</section>

