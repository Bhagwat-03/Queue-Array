public class Queue {
    int[] array;
    int topOfQueue;
    int beginningOfQueue;
    public Queue(int size){
        this.array =new int[size];
        this.beginningOfQueue=-1;
        this.topOfQueue=-1;
        System.out.println("The Queue was created with the size of: "+size);
    }
    public boolean isFull(){
        if(topOfQueue== array.length-1){
            System.out.println("The queue is full ");
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if((beginningOfQueue==-1)||(beginningOfQueue== array.length)){
            System.out.println("The queue is empty");
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue=0;
            topOfQueue++;
            array[topOfQueue]=value;
            System.out.println(value+" was added to the queue");
        }else{
            topOfQueue++;
            array[topOfQueue]=value;
            System.out.println(value+" was added to the queue");
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else{
            int result = array[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=topOfQueue=-1;
            }
            return result;
        }
    }
    public void traversal(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }
        else{
            for(int i=0;i< array.length;i++){
                System.out.println("The Element in the queue is "+ array[i]);
            }
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else{
            int peek= array[beginningOfQueue];
            System.out.println(peek);
            return peek;
        }
    }
    public void delete(){
        if(isEmpty()) {
            System.out.println("The Queue is empty");
        }else{
            beginningOfQueue=topOfQueue=-1;
            array=null;
            System.out.println("The Queue has been deleted");
        }
    }
}
