import java.io.*;
import java.util.*;


public class MyLinkedList{

  private Node head;

  public MyLinkedList(){
    head = null;
  }


  /* Add a new node which data value to the front of the list */
  public void add(String value){
	if(head == null) {
		head = new Node(null,null);
	}
	Node addNode = new Node(value, head.getNext());
    head.setNext(addNode);
  }

  /* Returns the value in the node at location index. */
  public String get(int index){
  
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    // Counter to track a node position
    int counter = 0;
    while(counter < index) {
      walker = walker.getNext();
      counter++;
    }
    return walker.getNext().getData();
  }

  /* Return the list as a string */
  public String toString(){
    // Create a reference to head. It will help loop through the list
    Node walker = head;
    String returnString = "";
    while(walker != null){
      returnString += walker.getNext();
      walker = walker.getNext();
    }
    return returnString;
  }

  /* Returns the number of elements in the list */
  public int size(){
    Node walker = head;
    int NumOfElements = 0;
    while(walker.getNext() != null){
      walker = walker.getNext();
      NumOfElements++;
    }
    return NumOfElements;
  }


  /*Adds a new node which contains value at index */
  public void add(int index, String value){
	  Node walker = head;
	  for(int counter = 0; counter < index; counter++) {
		  walker = walker.getNext();
	  }
	  Node addNode = new Node(value, walker.getNext());
	  walker.setNext(addNode);
  }


  /* Returns the index of the first node in the list that contains value. */
  public int indexOf(String value){
	  Node walker = head;
	  int counter = 0;
	  while(walker.getNext() != null) {
		  if(walker.getNext().getData() == value)
			  return counter;
		  walker = walker.getNext();
		  counter++;
	  }
      return -1;
  }


  /* Remove node al location index */

  public void remove(int index){
	  Node walker = head;
	  for(int counter = 0; counter < index; counter++) {
		  walker = walker.getNext();
		  System.out.println(walker);
	  }
	  walker.setNext(walker.getNext().getNext());
  }
}
