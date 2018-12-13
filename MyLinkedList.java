class Node{
 private Interger data;
 private Node next,prev;
 public Node(Node prev2, Interger number, Node next2){
   prev = prev2;
   data = number;
   next = next2;
 }
 public Node next(){
   return next;
 }
 public Node prev(){
   return prev;
 }
 public void setNext(Node other){
   next = other;
 }
 public void setPrev(Node other){
   prev = other;
 }
 public Interger getData(){
   return data;
 }
 public Interger setData(Interger i){
   data = i;
   return data;
 }
 public String toString(){
   return data +"";
 }
}
class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){

 }
 public int size();
 public boolean add(int value);
 public String toString();
}
