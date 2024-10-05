class Animal {
    public void sound(){
        System.out.println("animal make sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the dog can barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("the cat moves");
    }
}
public class override {
public static void main(String[] args){
    Animal a = new Animal();
    Animal Dog = new Dog();
    Animal Cat = new Cat();
    a.sound();
    Dog.sound();
    Cat.sound();
}
  }
