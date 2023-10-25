<%@ page import="com.youcode.app.helper.SecurityHelper" %> <%@ page
import="com.youcode.app.dao.base.model.Entity.Employee" %> <% Employee employee
= SecurityHelper.getSessionEmployee(request); %> <%@taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> <%@taglib prefix="f"
uri="http://java.sun.com/jsp/jstl/functions" %> <%@taglib prefix="d"
uri="http://java.sun.com/jsp/jstl/fmt" %> <%@ page
import="com.youcode.utils.db.enums.EmployeeRolesEnum" %>

<section class="vh-100" style="background-color: #f4f5f7">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-lg-6 mb-4 mb-lg-0">
        <div class="card mb-3" style="border-radius: 0.5rem">
          <div class="row g-0">
            <div
              class="col-md-4 bg-info text-center text-white"
              style="
                border-top-left-radius: 0.5rem;
                border-bottom-left-radius: 0.5rem;
              "
            >
              <img
                src="<%= employee.getImage() %>"
                class="img-fluid my-5"
                style="width: 80px"
              />
            </div>
            <div class="col-md-8">
              <div class="card-body p-4">
                <h6>Edit Profile</h6>
                <hr class="mt-0 mb-4" />
                <!-- Add form elements for editing profile information -->
                <form action="/update-profile" method="post">
                  <div class="mb-3">
                    <label for="name" class="form-label">First Name</label>
                    <input
                      id="firstName"
                      type="email"
                      class="form-control"
                      name="firstName"
                      value="<%= employee.getFirstName() %>"
                      required
                    />
                  </div>

                  <div class="mb-3">
                    <label for="name" class="form-label">Last Name</label>
                    <input
                      id="firstName"
                      type="email"
                      class="form-control"
                      name="lastName"
                      value="<%= employee.getLastName() %>"
                      required
                    />
                  </div>
                  <div class="mb-3">
                    <label for="role" class="form-label">Role</label>
                    <select id="role" name="role" class="form-select" required>
                      <option value="" disabled selected>Select a role</option>

                      <c:forEach
                        var="employeeRole"
                        items="${EmployeeRolesEnum.values()}"
                      >
                        <option value="${employeeRole}">${employeeRole}</option>
                      </c:forEach>
                    </select>
                  </div>

                  <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input
                      type="email"
                      class="form-control"
                      id="email"
                      name="email"
                      value="<%= employee.getEmail() %>"
                      required
                    />
                  </div>
                  <div class="mb-3">
                    <label for="phone" class="form-label">Phone</label>
                    <input
                      type="text"
                      class="form-control"
                      id="phone"
                      name="phone"
                      value="<%= employee.getPhone() %>"
                      required
                    />
                  </div>
                  <div class="d-flex justify-content-between">
                    <button type="submit" class="btn btn-primary">
                      Save Changes
                    </button>
                    <a href="Router?page=home" class="btn btn-secondary"
                      >Cancel</a
                    >
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
