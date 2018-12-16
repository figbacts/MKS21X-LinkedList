class Node{
 private Integer data;
 private Node next,prev;
 public Node(Node prev2, Integer number, Node next2){
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
 public Integer getData(){
   return data;
 }
 public Integer setData(Integer i){
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
   end = new Node (null,null,null);
 }


 public int size(){
   return size;
 }


 public boolean add(int value){
   if(size == 0){
     Node add = new Node(null,value,null);
     start.setNext(add);
     end.setPrev(add);
     size += 1;
    return true;
   }
   if (size != 0){
   Node pre = end.prev();
   Node add = new Node(pre, value, null);
   pre.setNext(add);
   end.setPrev(add);
   size += 1;
   return true;
 }
 return false;
 }

 public String toString(){
   if (size == 0){
     return "[]";
   }
   String ans = "[";
   System.out.println("\n");
   Node current = start.next();
   while (current != null){
   ans = ans + current.getData() + ", ";
   current = current.next();
    }
    ans = ans + "]";
    return ans;
 }

 public Integer get(int index){
   int counter = 0;
   Node current = start.next();
   while (counter != index){
     current = current.next();
     counter ++;
   }
   return current.getData();
 }


 public Integer set(int index,Integer value){
   int counter = 0;
   Node current = start.next();
   while (counter != index){
     current = current.next();
     counter ++;
   }
   counter = current.getData();
   current.setData(value);
   return counter;
 }

public boolean contains(Integer value){
  Node current = start.next();
  while (current != null){
    if (current.getData() == value){
      return true;
    }
    current = current.next();
  }
  return false;
}


}
