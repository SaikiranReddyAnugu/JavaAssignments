class Node<T>{
    T data;
    Node link;
    Node(T d){
        data=d;
        link=null;
    }
}
class SListIterator<T>{
    Node head=null;
    Node current=null;
    Node temp=null;

    /**
     * This method takes data and creates a node
     * then checks if it is not first insert then
     * insert at the last of the list
     * @param data
     */
    public void insert(T data){
    Node new_Node=new Node(data);
    new_Node.link=null;
    if(head==null){
    head=new_Node;
    current=head;
    temp=head;
      }
    current.link=new_Node;
    current=current.link;
}

    /**
     * removes the last node in the list
     */
    public void remove() {
    Node temp1=head;
    if (head.link == null) {
        System.out.println("List is empty");
    }else{
   while(temp1.link.link!=null){
       temp1=temp1.link;
   }
   current=temp1;
   temp1.link=null;
}}

    /**
     * This method returns the data value of the respective node in the list
     * @return value
     */
    public T next(){
    if(head.link!=null){
    T value=(T)temp.data;
    temp=temp.link;
    return value;}
    return null;
}

    /**
     * Checks if there is a next node
     * @return
     *     boolean value
     */
    public boolean hasNext(){
    return temp.link!=null;
}
}
class SList<T>{
    /**
     * This method returns the instance of SlistIterator
     * @return
     */
    SListIterator iterator(){
        return new SListIterator<T>();
    }
}
public class SingleLinkedListImpl {
    public static void main(String[] arg) {
        SList<Integer> list = new SList<Integer>();
        SListIterator it = list.iterator();
        it.insert(10);
        it.insert(20);
        it.insert(30);
        it.remove();
        it.insert(40);
        it.remove();
        it.remove();
        it.remove();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
