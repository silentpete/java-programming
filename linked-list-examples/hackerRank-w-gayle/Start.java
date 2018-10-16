class LinkedList {
  Node head;
  int count = 0;

  public void append(int data) {
    count++;
    if (head == null) {
      head = new Node(data);
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new Node(data);
  }

  public void prepend(int data) {
    count++;
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }

  public void deleteWithValue(int data) {
    if (head == null) return;
    if (head.data == data) {
      head = head.next;
      count--;
      return;
    }

    Node current = head;
    while (current.next != null) {
      if (current.next.data == data) {
        current.next = current.next.next;
        count--;
        return;
      }
      count--;
      current = current.next;
    }
  }

  public void printAllData() {
    if (head == null) return;

    System.out.println("Printing all data in LinkedList");
    Node current = head;
    for (int i = 0; i < count; i++) {
      System.out.println(current.data);
      current = current.next;
    }
  }
}

class Node {
  // properties
  Node next;
  int data;

  // constructors
  public Node(int data) {
    this.data = data;
  }
}

class Start {
  public static void main(String[] args) {
    int[] peter = {1,2,3};
    // System.out.println("testing printing out of array: " + peter[1]);

    LinkedList ll = new LinkedList();

    for (int i=0; i < peter.length; i++) {
      System.out.println("adding " + peter[i] + " to LinkedList");
      ll.append(peter[i]);
    }

    ll.printAllData();
  }
}
