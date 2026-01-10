
void setup() {
size(1000,1000);

}
  int number;
  int options = 3;
void draw() {
  if(mousePressed){
    number = (number+1) % options;
  }
  if (number==1){
fill (210,180,140);
ellipse( 500,500,750,750);
  }
  if (number==2){
fill( 178,24,7, 200);
ellipse(500,500,600,600);
  }

}
