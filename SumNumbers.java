import java.util.Scanner;
public class SumNumbers{
    static void function(int a, int b){
        System.out.println("in function "+(a+b));

    }
  
    
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
    int a;
    a = scanner.nextInt();
   System.out.println("sum of a ="+a);
    int b;                                                                                                                                                                          
    b = scanner.nextInt();
    System.out.println("Value of b"+b);

  System.out.println("Sum of a " + a + " Sum of b " + b);
            function(a,b);
    }

}
