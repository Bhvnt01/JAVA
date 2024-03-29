import java.util.Scanner;
public class Ok{

    static void function(int a, int b){
        System.out.println("in function"+ (a*b));
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        System.out.println("a = "+ a);
        int b;
        b= scanner.nextInt();
        System.out.println("b = "  + b);
        
        System.out.println("a*b =" +(a*b));
        function(a,b);
        
        
    }
}
    
