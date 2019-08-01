package yourname.assignment.singleton;

public class SecondClass {
    String str;
    public static SecondClass print(String s){
        //str=s; Non static field cannot be refernced from static context
        return  new SecondClass();
    }
  public void printString(){
        System.out.println(str);
    }

}
