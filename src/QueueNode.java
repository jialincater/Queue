// Gokhan Arik
//
// Queue Implementation

public class QueueNode<T>{

    private T data;
    private QueueNode<T> nextNode;

    public QueueNode(T data){
        this.data = data;
        nextNode = null;
    }
    
    public void setNext(QueueNode<T> node){
        nextNode = node;
    }
    public T getData(){
        return this.data;
    }

    public QueueNode<T> getNext(){
        return nextNode;
    }
}
