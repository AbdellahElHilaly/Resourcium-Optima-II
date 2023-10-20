<style>
  .box {
    margin-top: 60px;
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
  }

  .alert {
    margin-top: 25px;
    background-color: #fff;
    font-size: 25px;
    font-family: sans-serif;
    text-align: center;
    width: 300px;
    height: 200px;
    padding-top: 150px;
    position: relative;
    border: 1px solid #efefda;
    border-radius: 2%;
    box-shadow: 0px 0px 3px 1px #ccc;
  }

  .alert::before {
    width: 100px;
    height: 100px;
    position: absolute;
    border-radius: 100%;
    inset: 20px 0px 0px 100px;
    font-size: 60px;
    line-height: 100px;
    border: 5px solid gray;
    animation-name: reveal;
    animation-duration: 1.5s;
    animation-timing-function: ease-in-out;
  }

  .alert > .alert-body {
    opacity: 0;
    animation-name: reveal-message;
    animation-duration: 1s;
    animation-timing-function: ease-out;
    animation-delay: 1.5s;
    animation-fill-mode: forwards;
  }

  @keyframes reveal-message {
    from {
      opacity: 0;
    }
    to {
      opacity: 1;
    }
  }

  .error {
    color: red;
  }

  .error::before {
      content: "X";
      background-color: #fef;
      box-shadow: 0px 0px 12px 7px rgba(255, 200, 150, 0.8) inset;
      border: 5px solid red;
  }


  @keyframes reveal {
    0% {
      border: 5px solid transparent;
      color: transparent;
      box-shadow: 0px 0px 12px 7px rgba(255, 250, 250, 0.8) inset;
      transform: rotate(1000deg);
    }
    25% {
      border-top: 5px solid gray;
      color: transparent;
      box-shadow: 0px 0px 17px 10px rgba(255, 250, 250, 0.8) inset;
    }
    50% {
      border-right: 5px solid gray;
      border-left: 5px solid gray;
      color: transparent;
      box-shadow: 0px 0px 17px 10px rgba(200, 200, 200, 0.8) inset;
    }
    75% {
      border-bottom: 5px solid gray;
      color: gray;
      box-shadow: 0px 0px 12px 7px rgba(200, 200, 200, 0.8) inset;
    }
    100% {
      border: 5px solid gray;
      box-shadow: 0px 0px 12px 7px rgba(200, 200, 200, 0.8) inset;
    }
  }
</style>

<div class="box">
  <div class="error alert">
    <div class="alert-body">Error !</div>
  </div>
</div>
