
void setup() {
  PImage face = loadImage("face.jpeg");
  size(800,600);
  face.resize(width,height);
  background(face);
}

void draw() {
  if (mouseX < 190){
  mouseX = 190;
  } else if (mouseX > 245){
  mouseX = 245;
  }else if (mouseY < 290){
  mouseY = 290;
  }else if (mouseY >330){
  mouseY = 330;
  }
  fill(250,250,250);
  ellipse(220,310,95,80);
  fill(0,0,0);
  ellipse(mouseX,mouseY,20,20);
   fill(500,250,250);
  ellipse(420,310,95,80);
  fill(0,0,0);
  ellipse(mouseX+200,mouseY,20,20);
  
  
}
