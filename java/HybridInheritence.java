package demo;
public class HybridInheritence {
    public static void main(String[] args){
        D obj=new D();
        obj.Display();
    }
    
}
class A{
    int a = 1;
}
class B extends A{
    int b = 2;
}
interface c{
    int c = 3;
}
class D extends B implements c{
    int d = 4;
    int sum = a + b + c + d;
    public void Display(){
        System.out.println("The value of a is" + a);
        System.out.println("The value of a is" + b);
        System.out.println("The value of a is" + c);
        System.out.println("The value of a is" + d);
        System.out.println("The sum is" +sum);
    }
}