interface Parent1{
   void p1Method1();
   void p1Method2();
}
interface Parent2{
    void p2Method1();
    void p2Method2();
}
interface Parent3{
    void p3Method1();
    void p3Method2();
}
interface Parent4 extends Parent1,Parent2,Parent3{
    void p4Method1();
}
public class InterfaceDemo implements Parent4 {

    @Override
    public void p1Method1() {
        System.out.println("In Parent 1 Method 1");
    }

    @Override
    public void p1Method2() {
        System.out.println("In Parent 1 Method 2");
    }

    @Override
    public void p2Method1() {
        System.out.println("In Parent 2 Method 1");
    }

    @Override
    public void p2Method2() {
        System.out.println("In Parent 2 Method 2");
    }

    @Override
    public void p3Method1() {
        System.out.println("In Parent 3 Method 1");
    }

    @Override
    public void p3Method2() {
        System.out.println("In Parent 3 Method 2");
    }

    @Override
    public void p4Method1() {
        System.out.println("In Parent 4 Method 1");
    }
    public void child1(Parent1 p){
        p.p1Method1();
        p.p1Method2();
    }
    public void child2(Parent2 p){
        p.p2Method1();
        p.p2Method2();
    }
    public void child3(Parent3 p){
        p.p3Method1();
        p.p3Method2();
    }
    public void child4(Parent4 p){
        p.p4Method1();
    }
    public static void main(String args[]){
        InterfaceDemo id=new InterfaceDemo();
        id.child1(id);
        id.child2(id);
        id.child3(id);
        id.child4(id);
    }

}