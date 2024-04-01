import java.util.Scanner;
public class Yo{
    void function(int a){
        System.out.println("in function" + a);
    }
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if(a>18){
        System.out.println("You are eligible for license");
        }
        else {
        System.out.println("You can leave");
        }

        Yo yo = new Yo();
        yo.function(0);

    }
}
