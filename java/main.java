class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class parot extends Bird {
    void color() {
        System.out.println("The color is green");
    }
}

public class main
{

    public static void main(String[] args) {
        parot p = new parot();
        p.color(); 
        p.fly();
    }
}



