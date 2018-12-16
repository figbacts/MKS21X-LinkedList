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
 public MyLinkedList(int ary[]){
    start = new Node(null, null,null);
    end = new Node (null,null,null);
    for (int i = 0; i < ary.length; i ++){
      add(ary[i]);
    }

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
   while (current.next() != null){
   ans = ans + current.getData() + ", ";
   current = current.next();
    }
    ans = ans + current.getData()+ "]";
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
    if (current.getData().equals(value)){
      return true;
    }
    current = current.next();
  }
  return false;
}


public int indexOf(Integer value){
  int index = 0;
  Node current = start.next();
  while (current != null){
    if (current.getData().equals(value)){
      return index;
    }
    current = current.next();
    index ++;
  }
return -1;
}

public void add(int index,Integer value){
  if (index == size){
    add(value);
  }
 if(index == 0){
   Node next = start.next();
   Node add = new Node (null, value, next);
   next.setPrev(add);
   start.setNext(add);
   size += 1;
 }
if (index != size && index != 0){
  int counter = 0;
  Node current = start.next();
  while (counter != index){
    current = current.next();
    counter ++;
  }
  Node last = current.prev();
  Node add = new Node (last,value,current);
  last.setNext(add);
  current.setPrev(add);
  size += 1;
}
}

public Integer remove(int index){
  if (index + 1 == size){
    Integer ans = end.prev().getData();
    Node current = end.prev().prev();
    current.setNext(null);
    end.setPrev(current);
    size -= 1;
    return ans;
  }
  if (index == 0){
    Integer ans = start.next().getData();
    Node current = start.next().next();
    current.setPrev(null);
    start.setNext(current);
    size -= 1;
    return ans;
  }
    int counter = 0;
    Node current = start.next();
    while (counter != index){
      current = current.next();
      counter ++;
    }
  Integer ans = current.getData();
  Node last = current.prev();
  Node forward = current.next();
  last.setNext(forward);
  forward.setPrev(last);
  size -= 1;
  return ans;
}

public boolean remove(Integer value){
  if (!(contains(value))){
    return false;
  }
  int counter = 0;
  Node current = start.next();
  while (!(current.getData().equals(value))){
    current = current.next();
    counter ++;
  }
  System.out.println(counter);
  System.out.println(size);
  remove(counter);
  return true;
}

}
