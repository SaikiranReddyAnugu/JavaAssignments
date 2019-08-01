interface CycleF{
void balance();
}
class UniCycleF implements  CycleF{

    @Override
    public void balance() {
System.out.println("Balancing on UniCycle");
    }
}
class BiCycleF implements CycleF{

    @Override
    public void balance() {
        System.out.println("Balancing on BiCycle");
    }
}
class TriCycleF implements CycleF{

    @Override
    public void balance() {
        System.out.println("Balancing on TriCycle");
    }
}

public class CycleFactory {
public static CycleF getInstance(String type){
    if(type=="unicycle")
        return new UniCycleF();
    if(type=="bicycle")
        return new BiCycleF();
    if(type=="tricycle")
        return new TriCycleF();
    return null;
}
public static void main(String args[]){
    CycleF u=getInstance("unicycle");
    u.balance();
    CycleF b=getInstance("bicycle");
    b.balance();
    CycleF t=getInstance("tricycle");
    t.balance();
}
}
