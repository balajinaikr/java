class polymorphism1 {
    
    public int add(int a, int b, int c) {
            return a + b + c;
        }

        public double add(double a, double b) {
            return a + b;
        }

    }

    public class polymorphism {
        public static void main(String[] args){
            polymorphism1 p = new polymorphism1();
            System.out.println("sum of the integers:" + p.add(10,20));
            System.out.println("sum of the integers:" + p.add(10,20,30));
        
        }
    }

