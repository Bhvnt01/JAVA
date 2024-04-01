public class Constructors{
    int a,b;
    float c;

    Constructors(){
        System.out.println("in constructor");
    }
    public static void main(String args[]){
        Constructors constructors = new Constructors(); //default 
        constructors.a = 10;

        int a =10; //local 
        

    }
}