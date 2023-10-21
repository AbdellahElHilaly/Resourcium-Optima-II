<%@ page import="com.youcode.app.helper.ViewHelper" %>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <!-- Container wrapper -->
  <div class="container-fluid">
    <!-- Toggle button -->
    <button
      class="navbar-toggler"
      type="button"
      data-mdb-toggle="collapse"
      data-mdb-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <i class="fas fa-bars"></i>
    </button>

    <!-- Collapsible wrapper -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <!-- Navbar brand -->
      <a
        class="navbar-brand mt-2 mt-lg-0 position-relative"
        href="Router?page=home"
      >
        <img
          class="position-absolute top-50 start-0 translate-middle-y"
          src="https://cdn.pixabay.com/photo/2022/04/10/05/36/bird-7122682_960_720.png"
          height="30"
          alt="Logo"
          loading="lazy"
        />
        <div style="margin-left: 50px">
          <span class="fw-bold">You</span><span class="text-danger">Code</span>
        </div>
      </a>
      <!-- Left links -->
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="Router?page=dashboard">Dashboard</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Router?page=register">Register</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Router?page=login">Login</a>
        </li>
      </ul>
      <!-- Left links -->
    </div>
    <!-- Collapsible wrapper -->

    <!-- Right elements -->
    <div class="d-flex align-items-center">
      <!-- Icon -->
      <a class="text-reset me-3" href="Router?page=cart">
        <i class="fas fa-shopping-cart"></i>
      </a>

      <!-- Notifications -->
      <div>
        <a class="text-reset me-3" href="Router?page=notifications">
          <i class="fas fa-bell"></i>
          <span class="badge rounded-pill badge-notification bg-danger">9</span>
        </a>
      </div>

      <!-- Avatar -->
      <div class="dropdown">
        <a
          class="dropdown-toggle d-flex align-items-center hidden-arrow"
          href="#"
          id="navbarDropdownMenuAvatar"
          role="button"
          data-mdb-toggle="dropdown"
          aria-expanded="false"
        >
          <% String avatarPath = ViewHelper.getAvatarPath(request); %>
          <img
            src="<%= avatarPath %>"
            class="rounded-circle"
            height="22"
            alt=""
            loading="lazy"
          />
        </a>
        <ul
          class="dropdown-menu dropdown-menu-end"
          aria-labelledby="navbarDropdownMenuAvatar"
        >
          <li>
            <a class="dropdown-item" href="Router?page=profile">My profile</a>
          </li>
          <li>
            <a class="dropdown-item" href="Router?page=profile-setting"
              >Settings</a
            >
          </li>
          <li>
            <a class="dropdown-item" href="Router?page=logout">Logout</a>
          </li>
        </ul>
      </div>
    </div>
    <!-- Right elements -->
  </div>
  <!-- Container wrapper -->
</nav>
<!-- Navbar -->
