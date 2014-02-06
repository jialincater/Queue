// Gokhan Arik
//
// Queue Implementation

public class Queue<T>{

    private QueueNode<T> node;
    private QueueNode<T> lastNode;
    private QueueNode<T> firstNode;
    private int nOfElements;

    public Queue(){
        node = null;  
        nOfElements = 0;
    }
    
    public void queue(T data){
        if( isEmpty() ){
            node = new QueueNode<T>(data);
        	firstNode = lastNode = node;
        }
        else{
        	QueueNode<T> newNode = new QueueNode<T>(data);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        nOfElements++;
    }
    
    public T top(){
    	return lastNode.getData();
    }
    public T dequeue(){
    	if( isEmpty() ){
    		System.out.println("The Stack is empty");
    		return null;
    	}
    	else{
    		T data = firstNode.getData();
    		firstNode = node.getNext();
    		node = firstNode;
    		nOfElements--;
    		return data;
    	}
    }

    public void print(){
        
    	QueueNode<T> currentNode = node;
        System.out.println( "Size: " + lengthIs() +"\n");

        while( currentNode!= null ){
            System.out.println(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
        System.out.println();

    }

    public boolean isEmpty(){
        return nOfElements == 0;    
    }
    
    public int lengthIs(){
    	return nOfElements;
    }
}
