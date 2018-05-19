//CS 210, Fall 2015
//Ivan Fonseca
//Programming Assignment 5
//December 11, 2015

public class Set {

	LinkedNode front;
	LinkedNode prev;


	//This method adds any given input to the Linked List.
	void add(int x) {
		LinkedNode newNode = new LinkedNode(x);
		//Checks to see if x exists then prevents duplicates from being added 
		if(exists(x)){
			if(front == null){
				newNode.next = null;
				front = newNode;
			}
		}
		//If x doesn't exist in the list then it adds x to list
		else{
			newNode.next = front;
			front = newNode;
		}
	}

	//This method deletes any given input if it exists in the list
	void delete(int x) {
		LinkedNode cur = front;
		//deletes node associated with x 
		//if it is front
		if(x == front.x){
			front = front.next;
		}
		else{

			//loops until cur is equal null
			while (cur != null) {
				//Deletes node associated with x
				if (cur.x==x){
					prev.next = cur.next;
				}
				// Sets prev to become previous of cur.
				prev =cur;
				cur= cur.next;
			}
		}
	}

	// This method checks to see if x exists
	boolean exists(int x) {
		LinkedNode cur = front;

		while (cur!=null) {
			if (x==cur.x) return true;
			cur = cur.next;//Moves cur to next node
		}
		return false;
	}

	// This method returns a String
	// representing a linked list
	public String toString() {
		String str = "";

		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}

		return str;
	}
}
