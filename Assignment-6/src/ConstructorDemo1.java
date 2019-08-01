public class ConstructorDemo1 {
    ConstructorDemo1(String argument){
        System.out.println("Argument is "+argument);
    }
    public static void main(String args[]){
        ConstructorDemo1[] d={new ConstructorDemo1("hai"),new ConstructorDemo1("james")};
    }
}
