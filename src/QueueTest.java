// Gokhan Arik
//
// Queue Implementation

public class QueueTest{

    public static void main(String args[]){
       
       System.out.println("Creating new Stack");
       Queue<String> testQueue = new Queue<String>();
       
       System.out.println("Adding element to Stack");
       testQueue.push("Gokhan");
       testQueue.print();
       testQueue.push("Arik");
       testQueue.print();
       testQueue.push("asd");
       testQueue.print();
       testQueue.push("sss");
       testQueue.print();
       testQueue.push("as");
       testQueue.print();
       testQueue.push("ds");
       testQueue.print();
       
       System.out.println("Popping element from the Stack");
       testQueue.dequeue();
       testQueue.print();
       testQueue.dequeue();
       testQueue.print();
       testQueue.dequeue();
       testQueue.print();
       testQueue.dequeue();
       testQueue.print();
    }
}
