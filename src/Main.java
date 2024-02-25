public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(39);
        q.enqueue(46);
        q.enqueue(23);
        q.enqueue(35);
        q.enqueue(45);
        q.traversal();
        q.peek();
        q.dequeue();
        boolean result1 =  q.isEmpty();
        System.out.println(result1);
        boolean result2 = q.isFull();
        System.out.println(result2);
    }
}