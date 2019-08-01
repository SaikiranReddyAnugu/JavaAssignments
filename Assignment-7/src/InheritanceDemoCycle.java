class Cycle{
}
class UniCycle extends Cycle{
    public void balance(){
   System.out.println("Balancing on Unicycle");
    }

}
class BiCycle extends Cycle{
    public void balance(){
        System.out.println("Balancing on Bicycle");
    }
}
class TriCycle extends Cycle{

}


public class InheritanceDemoCycle {
    public static void main(String args[]){
UniCycle u=new UniCycle();
BiCycle b=new BiCycle();
TriCycle t=new TriCycle();
Cycle[] parent={u,b,t};
      /*  parent[0].balance();
        parent[1].balance();
        parent[2].balance();*/ //As parent class doesnt have balance method we cannot using parent reference
        ((UniCycle)parent[0]).balance();
        ((BiCycle)parent[1]).balance();
    }

}
