class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class QueueUsingLL {
	//Define the data members
    private Node front;
    private Node rear;
    private int size;


	public QueueUsingLL() {
		//Implement the Constructor
        front=null;
        rear=null;
        size=0;
	}
	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() {
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() {
    	//Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node newnode=new Node(data);
        if(front == null)
        {
            front=newnode;
            rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
        size++;
    }


    public int dequeue() {
        if(front != null)
        {
            int temp=front.data;
            front = front.next;
            size--;
            return temp;
        }
        else
            return -1;
    	//Implement the dequeue() function
    }


    public int front() {
    	//Implement the front() function
        if(front != null)
            return front.data;
        return -1;
    }
}

