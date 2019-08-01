abstract class RodentClass {
public abstract void size();
public abstract void  tail();
public RodentClass(){
System.out.println("This is Rodent");
}

}
class Mouse extends RodentClass {
    public  Mouse(){
        System.out.println("This is Mouse");
    }

    @Override
    public void size() {
        System.out.println("The Mouse is less than 10cm in size ");
    }

    @Override
    public void tail() {
        System.out.println("The Mouse has long tail");
    }
}
 class Gerbil extends RodentClass {
     public Gerbil(){
        System.out.println("This is Gerbil");
    }

     @Override
     public void size() {
         System.out.println("Gebril is about 13cm in size ");
     }

     @Override
     public void tail() {
         System.out.println("Gebril has small tail");
     }
 }
 class Hamster extends RodentClass {
     public Hamster(){
        System.out.println("This is Hamster");
    }

     @Override
     public void size() {
         System.out.println("Hamster is about 12cm in size");
     }

     @Override
     public void tail() {
         System.out.println("Hamster has small or no Tail ");
     }
 }
public class InheritanceDemo{
    public static void main(String args[]){
RodentClass[] parent={new Mouse(),new Gerbil(),new Hamster()};
for(RodentClass child:parent){
    child.size();
    child.tail();
}
        }

        }