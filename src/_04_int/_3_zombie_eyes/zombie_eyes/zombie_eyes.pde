
void setup() {

PImage face = loadImage("67kid.png");  
  size(600,600);
  face.resize(600,600);
  image(face,0,0);
 
  
  
  
  draw();
  
  
  
  
  
  
  
}
void draw() {
  fill(255,255,255);
ellipse(180,145,80,30);
   ellipse(410,145,80,30);

   
   
   fill(0,0,0);
  ellipse(405,145,20,20);
   ellipse(190,145,20,20);
}
