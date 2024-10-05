 class person{
    private String Name;
    private int Age;

public String getName(){
    return Name;
}
public void setName(String name) {
    if(name != null){
        this.Name = name;

    }
    else{
        System.out.println("Invalid name:" +name);
    }
    
}
public int getAge(){
    return Age;
}
public void setAge(int Age){
    if(Age>0){
        this.Age=Age;
    }
    else{
        System.out.println("Invalid name:" +Name);
    }
}
    }
 

 
    public class encapsulation{
        public static void main(String[] args) {
            person person = new person();
            person.setName("kavya");
            person.setAge(20);

            System.out.println("Name:" + person.getName());
            System.out.println("Age:" + person.getAge());

            person.setAge(-5);
        }
    }




 

