 public class Bike {
  //  public void Display(String name){
     //   System.out.println("Name:" + name);
  //  }
  //public static int square(int number){
  //return number * number;
String brand;
static int year;
public Bike(String brand, int year){
    this.brand=brand;
    Bike.year=year;

}  
public void DisplayCarInfo(){
    System.out.println("Bike brand:" + brand);
    System.out.println("Manufacture:" + year);
}


    public static void main(String[] args) {
       // InstanceMethod a = new InstanceMethod();
        //a.Display("Hi");
      // int result = InstanceMethod.square(5);
      // System.out.println("square of 5 is :" + result);
      Bike myBike = new Bike("KTM",1990);
      myBike.DisplayCarInfo();

   
    }
    
}
