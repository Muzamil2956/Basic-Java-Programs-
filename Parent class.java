class Pclass{
public void pmethod(){
System.out.println("This is a parent class");
}
}
class Cclass extends Pclass{
public void cmethod(){
system.out.println("This is a child class");
}
}
class  Ans{
public static void main(string[] args){
Pclass m= new Pclass();
Cclass n= new Cclass();
m.pmethod();
n.cmethod();
n.pmethod();
}
}