class OuterParent{
    class InnerParent{
        InnerParent(String arg){
System.out.println("Inside Inner class of Outer Parent received argument"+arg);
        }
    }
}
class OuterChild{
    class InnerChild extends OuterParent.InnerParent {
InnerChild(OuterParent p){
    p.super("xyz");
    System.out.println("Inside Inner class of Outer Child class");

}
    }
}
public class InnerClassInheritanceDemo {
    public static void main(String args[]){
        OuterParent op=new OuterParent();
        OuterChild oc=new OuterChild();
        OuterChild.InnerChild c=oc.new InnerChild(op);
    }
}
