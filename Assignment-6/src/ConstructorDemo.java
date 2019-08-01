public class ConstructorDemo {
    ConstructorDemo(String argument){
        System.out.println("Argument is "+argument);
    }
    public static void main(String args[]){
        ConstructorDemo[] d=new ConstructorDemo[5];
    }
}
//No output since the object is not created so the constructor is not invoked