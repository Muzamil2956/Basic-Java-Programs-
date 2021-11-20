class Ans{
public static void main(string[]args){
Rectangle r= new Rectangle(4,5);
r.printArea();
r.printPerimeter();
Square s=new Square(4);
s.printArea();
s.printPerimeter();
Square[] a=new Square[10];
int k=5;
for(int i=0;i,10;1++){
a[i] = new Square(k);
k++;
}
for(int i=0;i<10;i++){
a[i].printArea();
a[i].printPerimeter();
}
}
}