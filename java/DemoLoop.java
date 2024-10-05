package demo.Loop;
public class DemoLoop {
    public static void main(String[] args){
        for(int i=0;i<1;i++){
            System.out.println("hello word");
        }
        for(int i=0;i<10;i++){
            System.out.println("i=" +i);
        }
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println(i+ " " +j);
            }
        }
           
            int n=1;
            while(n<10){
                System.out.println("n =" +n);
                n++;
        }
        do{
            System.out.println("n =" +n);
            n++;
        }
        while(n<10);
    }
}

    
    



