<style>
  .atom-container {
    text-align: center;
    margin: 0;
    display: flex;
    align-items: center;
    justify-content: center;
  }
  #atom {
    width: 300px;
    height: 300px;
  }

  #nucleus,
  .orbit,
  .electron,
  .orbitTrain,
  .electronTrain {
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    width: 25px;
    height: 25px;
    border-radius: 50%;
    margin: auto;
  }
  #nucleus {
    background: #2196f3;
    box-shadow: 0 0 15px #2196f3;
    -webkit-animation: shining 2s infinite linear;
    -moz-animation: shining 2s infinite linear;
    -ms-animation: shining 2s infinite linear;
    -o-animation: shining 2s infinite linear;
    animation: shining 2s infinite linear;
  }
  .orbit:before {
    content: " ";
    position: absolute;
    z-index: -1;
    top: 0px;
    left: 0px;
    right: 0px;
    bottom: 0px;
    border: 0.5px solid rgba(255, 255, 255, 0.1);
    border-radius: 50%;
  }
  .orbit {
    width: 200px;
    height: 200px;
    border: 0;
    transform-style: preserve-3d;
    -webkit-animation: orbitSpecial 1.5s infinite linear;
    -moz-animation: orbitSpecial 1.5s infinite linear;
    -ms-animation: orbitSpecial 1.5s infinite linear;
    -o-animation: orbitSpecial 1.5s infinite linear;
    animation: orbitSpecial 1.5s infinite linear;
  }
  .orbit .electron {
    position: relative;
    top: 95px;
    width: 10px;
    height: 10px;
    background: #ff9800;
    box-shadow: 0 0 15px #ff9800;
    border-radius: 50%;
    transform: translateX(100px);
    -webkit-animation: electronAnimation 1.5s infinite linear;
    -moz-animation: electronAnimation 1.5s infinite linear;
    -ms-animation: electronAnimation 1.5s infinite linear;
    -o-animation: electronAnimation 1.5s infinite linear;
    animation: electronAnimation 1.5s infinite linear;
  }
  .orbit:nth-child(4) {
    transform: rotateY(65deg) rotateX(5deg);
    animation-delay: -1s;
  }
  .orbit:nth-child(4) .electron {
    animation-delay: -1s;
  }
  .orbit:nth-child(2) {
    transform: rotateY(65deg) rotateX(-54deg);
    animation-delay: -1s;
    animation-duration: 1s;
  }
  .orbit:nth-child(2) .electron {
    animation-duration: 1s;
  }
  .orbit:nth-child(3) {
    transform: rotateY(65deg) rotateX(54deg);
  }
  @-webkit-keyframes electronAnimation {
    0% {
      transform: rotateZ(0deg) translateX(100px) rotateZ(0deg) rotateY(-65deg);
    }
    100% {
      transform: rotateZ(360deg) translateX(100px) rotateZ(-360deg)
        rotateY(-65deg);
    }
  }
  @-moz-keyframes electronAnimation {
    0% {
      transform: rotateZ(0deg) translateX(100px) rotateZ(0deg) rotateY(-65deg);
    }
    100% {
      transform: rotateZ(360deg) translateX(100px) rotateZ(-360deg)
        rotateY(-65deg);
    }
  }
  @-ms-keyframes electronAnimation {
    0% {
      transform: rotateZ(0deg) translateX(100px) rotateZ(0deg) rotateY(-65deg);
    }
    100% {
      transform: rotateZ(360deg) translateX(100px) rotateZ(-360deg)
        rotateY(-65deg);
    }
  }
  @-o-keyframes electronAnimation {
    0% {
      transform: rotateZ(0deg) translateX(100px) rotateZ(0deg) rotateY(-65deg);
    }
    100% {
      transform: rotateZ(360deg) translateX(100px) rotateZ(-360deg)
        rotateY(-65deg);
    }
  }
  @keyframes electronAnimation {
    0% {
      transform: rotateZ(0deg) translateX(100px) rotateZ(0deg) rotateY(-65deg);
    }
    100% {
      transform: rotateZ(360deg) translateX(100px) rotateZ(-360deg)
        rotateY(-65deg);
    }
  }
  @-webkit-keyframes orbitSpecial {
    0% {
      border: 0;
      border-top: 1px solid rgba(255, 255, 255, 0.5);
    }
    35% {
      border: 0;
      border-right: 1px solid rgba(255, 255, 255, 0.5);
    }
    70% {
      border: 0;
      border-bottom: 1px solid rgba(255, 255, 255, 0.5);
    }
    100% {
      border: 0;
      border-left: 1px solid rgba(255, 255, 255, 0.5);
    }
  }
  @-moz-keyframes orbitSpecial {
    0% {
      border: 0;
      border-top: 1px solid rgba(255, 255, 255, 0.5);
    }
    35% {
      border: 0;
      border-right: 1px solid rgba(255, 255, 255, 0.5);
    }
    70% {
      border: 0;
      border-bottom: 1px solid rgba(255, 255, 255, 0.5);
    }
    100% {
      border: 0;
      border-left: 1px solid rgba(255, 255, 255, 0.5);
    }
  }
  @-ms-keyframes orbitSpecial {
    0% {
      border: 0;
      border-top: 1px solid rgba(255, 255, 255, 0.5);
    }
    35% {
      border: 0;
      border-right: 1px solid rgba(255, 255, 255, 0.5);
    }
    70% {
      border: 0;
      border-bottom: 1px solid rgba(255, 255, 255, 0.5);
    }
    100% {
      border: 0;
      border-left: 1px solid rgba(255, 255, 255, 0.5);
    }
  }
  @-o-keyframes orbitSpecial {
    0% {
      border: 0;
      border-top: 1px solid rgba(255, 255, 255, 0.5);
    }
    35% {
      border: 0;
      border-right: 1px solid rgba(255, 255, 255, 0.5);
    }
    70% {
      border: 0;
      border-bottom: 1px solid rgba(255, 255, 255, 0.5);
    }
    100% {
      border: 0;
      border-left: 1px solid rgba(255, 255, 255, 0.5);
    }
  }
  @keyframes orbitSpecial {
    0% {
      border: 0;
      border-top: 1px solid rgba(255, 255, 255, 0.5);
    }
    35% {
      border: 0;
      border-right: 1px solid rgba(255, 255, 255, 0.5);
    }
    70% {
      border: 0;
      border-bottom: 1px solid rgba(255, 255, 255, 0.5);
    }
    100% {
      border: 0;
      border-left: 1px solid rgba(255, 255, 255, 0.5);
    }
  }
  @-webkit-keyframes shining {
    0% {
      box-shadow: 0 0 0 transparent;
    }
    50% {
      box-shadow: 0 0 40px #2196f3;
    }
    100% {
      box-shadow: 0 0 0 transparent;
    }
  }
  @-moz-keyframes shining {
    0% {
      box-shadow: 0 0 0 transparent;
    }
    50% {
      box-shadow: 0 0 40px #2196f3;
    }
    100% {
      box-shadow: 0 0 0 transparent;
    }
  }
  @-ms-keyframes shining {
    0% {
      box-shadow: 0 0 0 transparent;
    }
    50% {
      box-shadow: 0 0 40px #2196f3;
    }
    100% {
      box-shadow: 0 0 0 transparent;
    }
  }
  @-o-keyframes shining {
    0% {
      box-shadow: 0 0 0 transparent;
    }
    50% {
      box-shadow: 0 0 40px #2196f3;
    }
    100% {
      box-shadow: 0 0 0 transparent;
    }
  }
  @keyframes shining {
    0% {
      box-shadow: 0 0 0 transparent;
    }
    50% {
      box-shadow: 0 0 40px #2196f3;
    }
    100% {
      box-shadow: 0 0 0 transparent;
    }
  }
</style>

<div class="atom-container">
  <div id="atom" class="bg-black text-white">
    <h1>Waiting</h1>
    <p><%= request.getAttribute("message") %></p>

    <div id="nucleus"></div>
    <div class="orbit">
      <div class="electron"></div>
    </div>
    <div class="orbit">
      <div class="electron"></div>
    </div>
    <div class="orbit">
      <div class="electron"></div>
    </div>
  </div>
</div>
