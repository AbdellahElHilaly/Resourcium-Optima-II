<main>
  <!-- Intro settings -->
  <style>
    /* Default height for small devices */
    #intro-example {
      height: 400px;
    }

    /* Height for devices larger than 992px */
    @media (min-width: 992px) {
      #intro-example {
        height: 600px;
      }
    }
  </style>

  <section>
    <div
      id="intro-example"
      class="p-5 text-center bg-image"
      style="
        background-image: url('https://mdbcdn.b-cdn.net/img/new/slides/041.webp');
      "
    >
      <div class="mask" style="background-color: rgba(0, 0, 0, 0.7)">
        <div class="d-flex justify-content-center align-items-center h-100">
          <div class="text-white">
            <h1 class="mb-3">Resourcium Optima II</h1>
            <h5 class="mb-4">Management of resources & equipment</h5>
            <a
              class="btn btn-outline-light btn-lg m-2"
              href="https://www.youtube.com/watch?v=c9B4TPnak1A"
              role="button"
              rel="nofollow"
              target="_blank"
              >Start tutorial</a
            >
            <a
              class="btn btn-outline-light btn-lg m-2"
              href="https://mdbootstrap.com/docs/standard/"
              target="_blank"
              role="button"
              >Download MDB UI KIT</a
            >
          </div>
        </div>
      </div>
    </div>
  </section>

  <jsp:include page="/view/components/department/menu.jsp" />
</main>
