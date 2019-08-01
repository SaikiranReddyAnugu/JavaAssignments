public class ConstructorOverloadDemo {
    ConstructorOverloadDemo(int age){
        System.out.println("Age:"+age);
    }
    ConstructorOverloadDemo(String name,int age){
        this(age);
        System.out.println("name:"+name);
    }
    public static void main(String args[]){
        ConstructorOverloadDemo c=new ConstructorOverloadDemo("james",21);
    }
}
