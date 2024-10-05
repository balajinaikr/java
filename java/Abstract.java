 abstract class animal { 
    public abstract void sound();
    public void sleep(){
    System.out.println("The Animal is Sleeping");
 }
}
 class Dog extends animal{
   public void sound(){
      System.out.println("The dog barks");
   }
}
class Cat extends animal{
   public void sound(){
      System.out.println("Cat meow"); 
      
   }
}

public class Abstract{
   public static void main(String[] args){
      animal MyDog = new Dog();
      animal Mycat = new Cat();

      MyDog.sound();
      Mycat.sound();

      MyDog.sleep();
     Mycat.sleep();
      


   }

 }
