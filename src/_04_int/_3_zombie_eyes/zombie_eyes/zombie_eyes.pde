int ranColor = 0, ranBlue=0, ranRed = 0;

void setup() {

PImage face = loadImage("67kid.png");  
  size(600,600);
  face.resize(600,600);
  image(face,0,0);
 
  
  
  
  draw();
  
  
  
  
  
  
  
}
void draw() {
  
  
  fill(ranColor,ranBlue,ranRed);
ellipse(180,145,80,30);
   ellipse(410,145,80,30);

   
   
   fill(0,0,0);
  ellipse(405,145,20,20);
   ellipse(190,145,20,20);
}

void mouseMoved()  {
 draw();
    ranColor+=1;
  ranBlue+=5;
  ranRed+=3;
  
  if (ranRed>255){
    ranRed-=3;
  }
  if (ranBlue>255){
    ranBlue-=4;
  }
  if (ranColor>255){
    ranColor-=7;
  }
}
