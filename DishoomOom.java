import java.util.Scanner;
public class DishoomOom
{
    String name; //instance

    DishoomOom(){ //default constructor
        name = "Not assigned";
        System.out.println("in Constrcutor");

    }

    DishoomOom(String name){ //parameterized constructor
        this.name = name;
    }

    DishoomOom(int a, int b){

    }

    void function(){
        System.out.println("in function");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DishoomOom dishoomOom = new DishoomOom();
        System.out.println("name "+dishoomOom.name);

        
        DishoomOom dishoomOom1 = new DishoomOom("bhavneet");
        System.out.println("name "+dishoomOom1.name);
        
        int a, b;
        System.out.println("Enter the value of a");
        a = scanner.nextInt();
        
        System.out.println("Enter the value of b");
        b = scanner.nextInt();
        
        DishoomOom dishoomOom2 = new DishoomOom(a,b);
      //  dishoomOom.function();
        // int a=25;
        // int b=78;
        int c=87;
        if(a<b && a<c){
            System.out.println("a should be ashamed");
            }else if(b<a && b<c){
                System.out.println("i am very proud of you b");
                }else if(c<a && c<b){
                    System.out.println("very poor to you c ");
                        System.out.println(""); 
                    }
                }
            }