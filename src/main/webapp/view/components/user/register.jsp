<section class="">
  <div class="container my-3">
    <div class="row d-flex justify-content-center align-items-center">
      <div class="col-lg-12 col-xl-11">
        <div class="card text-black" style="border-radius: 25px">
          <div class="card-body p-md-5">
            <div class="row justify-content-center">
              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">
                  Sign up
                </p>
                <form
                  class="mx-1 mx-md-4"
                  action="http://localhost:8080/Resourcium_Optima_II/Employee?action=register"
                  method="post"
                >
                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-employee fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input
                        type="text"
                        id="firstName"
                        name="firstName"
                        class="form-control"
                        placeholder="Your First Name"
                      />
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-employee fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input
                        type="text"
                        id="lastName"
                        name="lastName"
                        class="form-control"
                        placeholder="Your Last Name"
                      />
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input
                        type="email"
                        id="email"
                        name="email"
                        class="form-control"
                        placeholder="Your Email"
                      />
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input
                        type="password"
                        id="password"
                        name="password"
                        class="form-control"
                        placeholder="Password"
                      />
                    </div>
                  </div>

                  <div class="d-flex flex-row align-items-center mb-4">
                    <i class="fas fa-phone fa-lg me-3 fa-fw"></i>
                    <div class="form-outline flex-fill mb-0">
                      <input
                        type="tel"
                        id="phone"
                        name="phone"
                        class="form-control"
                        placeholder="Your Phone"
                      />
                    </div>
                  </div>

                  <div class="form-check d-flex justify-content-center mb-5">
                    <input
                      class="form-check-input me-2"
                      type="checkbox"
                      value=""
                      id="form2Example3c"
                    />
                    <label class="form-check-label" for="form2Example3">
                      I agree to all statements in
                      <a href="#!">Terms of service</a>
                    </label>
                  </div>

                  <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                    <button type="submit" class="btn btn-primary btn-lg">
                      Register
                    </button>
                  </div>
                </form>
              </div>
              <div
                class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2"
              >
                <img
                  src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                  class="img-fluid"
                  alt="Phone image"
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
