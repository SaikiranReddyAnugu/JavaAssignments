package yourname.assignment.main;

import yourname.assignment.data.FirstClass;
import yourname.assignment.singleton.SecondClass;

public class Main {
    public static void main(String args[]){
        FirstClass a=new FirstClass();
        a.print();
        a.printForLocal();
        SecondClass b=SecondClass.print("input");
        b.printString();

    }

}
