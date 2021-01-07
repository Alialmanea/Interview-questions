class Node<T>{
  T data;
  Node next; 
  Node(T data){
    this.data = data;
    this.next = null;
  }
}

class LinkedList<T>{
  Node<T> head;
  LinkedList (){
    this.head = null;
  }
  LinkedList(T data){
    this.head = new Node(data);
  }
  void append(T data){
    Node<T> newNode = new Node(data);
    if(this.head != null){
      Node<T> temp = this.head;
      while(temp.next != null)
        temp = temp.next; 

      temp.next = newNode;
    }else{
      this.head = newNode;
    }
    return;
  }
  int size(){
    int i = 0;
    Node<T> temp = this.head;
    while(temp != null){
      temp = temp.next;
      i++;
    }

    return i;
  }
  public String tosString(){
    String str = "";
    Node<T> temp = this.head;
    while(temp != null){
      str += String.valueOf(temp.data)+"-> ";
      temp = temp.next; 
    }
    return str;
  }
}
class Main {
/* The  time complexity of solution is O(ls.size())
  static int Nth_to_lastLinkedListElement (int i, LinkedList ls){
    int l = ls.size() - i;
    if(l >= 0 && ls.size() > 0){
      Node<Integer> temp = ls.head;
      while(l > 0){
        temp = temp.next;
        l--;
      }
      return temp.data;
    }
    return -1;
  }
  */
  
  
  static int nthtolastLinkedListElement(Node n, int x){
    Node currnet = n;
    Node follower = n;
    for (int i = 1;i < x;i++){
      if(currnet == null) return -1;
      currnet = currnet.next;
    }
    while(currnet.next != null){
      currnet = currnet.next;
      follower = follower.next;
    }

    return follower.data;
  }
  
  public static void main(String[] args) {
    LinkedList<Integer> ls = new LinkedList();
    ls.append(1);
    ls.append(2);
    ls.append(3);
    ls.append(4);
    ls.append(5);
    System.out.println(ls.tosString());
    System.out.println("size of current linkedList is :"+ls.size());
    for(int i = ls.size(); i > 0;i--)
      System.out.println(i+" output is:"+Nth_to_lastLinkedListElement(i,ls));
    }
}
