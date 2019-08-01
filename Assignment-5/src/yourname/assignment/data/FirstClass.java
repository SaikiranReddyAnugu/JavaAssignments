package yourname.assignment.data;

public class FirstClass {
    int mem1;
    char mem2;
   public void print(){
        System.out.println(mem1+" "+mem2);
    }
   public void printForLocal(){
        int loc1;
        char loc2;
        //System.out.println(loc1+" "+loc2); Local varibles doesnt have default values so they give error while printing them without initializing
    }

}
