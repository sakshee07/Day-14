package com.LinkedList.bl;

public class LinkedList {
	
		  private Node head;
		  
		  private class Node {
			  int key;
			  Node next;
			  
			  public Node(int key) {
				  this.key = key ;		  
			  }
		  }
	//add element
		  public boolean  add(int data) {
			 boolean isAdded = false;
			  Node newNode = new Node(data);   
			  
			   if(head == null) {  
				  head = newNode;   
				  isAdded = true;
			  }else {
				   Node temp = head;
				   
				   while(temp.next !=null) {
					   temp = temp.next;
					   
				   }
				   temp.next = newNode;
				   isAdded = true;
			  }
			  return isAdded;
		  }
		  public void push(int data) {
				Node newNode = new Node(data);
				newNode.next = head;
				head = newNode;
			}
		  
		  public boolean append(int data) {
				boolean isAdded = false;
				
				Node node = new Node(data);
				if(head == null) {
					head = node;
					isAdded = true;
				}
				else {
					Node temp = head;
					while(temp.next != null) {
						temp = temp.next;
					}
					temp.next = node;
					isAdded = true;
				}
				return isAdded;
			}
		  
	//insert at 
		  public void insertAtPosition(int position, int data) {
				if(position<1) {
					System.out.println("invalide position");
				}
				if(position==1) {
					push(data);
				}else {
					Node newNode =new Node(data);
					Node temp = head;
					int count=1;
					while(count<position-1) {
						temp=temp.next;
						count++;
					}
					Node current = temp.next;
					temp.next = newNode;
					newNode.next=current;
				}
			}
		  public int pop() {
				
				if(head==null) {
					System.out.println("List is empty");
				}
				Node temp = head;
				head = temp.next;
				
				return temp.key;
			}

		  public int popLast() {
				if(head==null) {
					System.out.println("List is empty");
				}
				
				Node temp = head;
				
				while(temp.next.next != null) {
					temp=temp.next;
				}
				
				int popLastKey=temp.next.key;
				temp.next=null;
				return popLastKey;
			}
		  
		  public boolean search(int elememt) {
				
				if(head == null) {
					System.out.println("List is empty");
					return false;
				}
				Node temp = head;
				boolean isFound = false;
				while(temp != null) {
					
					if(temp.key == elememt) {
						isFound = true;
						break;
					}
					temp = temp.next;
				}
				System.out.println(isFound);
				return isFound;
			}
		  
		  public void insertNextToElement(int elememt, int data) {
				
				Node node = new Node(data);
				if(head == null) {
					System.out.println("List is empty");
				}
				Node temp = head;
				while(temp != null) {
					
					if(temp.key == elememt) {
						Node newNode = temp.next;
						temp.next = node;
						node.next = newNode;
						break;
					}
					temp = temp.next;
				}
			}
		  
		  public boolean remove(int element) {
				if(!search(element)) {
					System.out.println("Data not present");
					return false;
				}
				Node temp = head;
				Node prev = null;
				if(temp != null && temp.key == element) {
					head = temp.next;
					return true;
				}
					
				while(temp != null) {
					if(temp.key == element ) {
						prev.next = temp.next;
						return true;
					}
					prev = temp;
					temp = temp.next;
				}
				
				return false;
				
			}
		  
		  
			public void print() {
				if(head==null) {
					System.out.println("linkedList is empty");
				}else {
					Node temp =head;
					System.out.println("LinkedList is : ");
					while(temp!=null) {
						System.out.print(temp.key + "->");
						temp=temp.next;
					}
				}
				System.out.println();	
		}	}
