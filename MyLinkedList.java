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
   start = new Node(null, null, null);
   end = new Node (null,null,null)
 }


 public int size(){
   return size;
 }


 public boolean add(int value){
   if(size = 0){
     Node add = new Node(null,value,null);
     start.setNext(add);
     end.setPrev(add);
     size += 1;
    return true;
   }
   else{
   Node add = new Node(end.prev(), value, null);
   end.setPrev(add)
   size += 1;
   return true;
 }
 return false;
 }

 public String toString(){
   if (size = 0){
     return "[]";
   }
   String ans = "["
   Node current = start.next();
   while (current.getData() != null){
   ans = ans + current.getData(); + ", "
   current = current.next();
    }
    ans = ans + "]"
    return ans;
 }

 
}
