public Class Functions{
    void printFunction(){
        System.out.println(" in function");
    }
    void showSum(int a, int b){
        System.out.println("in sum "+(a+b));
    }
    int returnValue(){
        return 10;
    }

    int withArgumentWithReturn(int a){
        return a+100;
    }
    public static void main(String args[]){
        Functions functions = new Functions();
        functions.printFunction();
        functions.showSum(10,34);
        int b = functions.returnValue();
                System.out.println("b = "+b);
        System.out.println("in return function "+functions.returnValue());
        int a = functions.withArgumentWithReturn(10);
        System.out.println("a = "+a);
    }
}