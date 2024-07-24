function toggleMenu() {
  const menu = document.querySelector(".menu-links");
  const icon = document.querySelector(".hamburger-icon");
  menu.classList.toggle("open");
  icon.classList.toggle("open");
}
 
function btninfo() {
  var section = document.getElementById('contact');
  if(section) {
    section.scrollIntoView({ behavior:'smooth' });
  }
}

function btnabout() {
  var section = document.getElementById('experience');
  if(section) {
    section.scrollIntoView({ behavior:'smooth' });
  }
}

function btnexp() {
  var section = document.getElementById('projects');
  if(section) {
    section.scrollIntoView({ behavior:'smooth' });
  }
}

function btnproject() {
  var section = document.getElementById('contact');
  if(section) {
    section.scrollIntoView({ behavior:'smooth' });
  }
}

