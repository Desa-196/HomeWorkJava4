/*
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    public static void main(String[] args){

        MyQueue<Integer> myQueue = new MyQueue<Integer>();
        MyQueue<String> myQueueString = new MyQueue<String>();

        //Добавляем элементы в конец очереди
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        myQueueString.enqueue("Строка 1");
        myQueueString.enqueue("Строка 2");
        myQueueString.enqueue("Строка 3");

        System.out.println(myQueueString);

        System.out.println(myQueue);
        System.out.print("Первый элемент с удалением: ");
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);
        System.out.print("Первый элемент без удаления: ");
        System.out.println(myQueue.first());
        System.out.println(myQueue);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        //При пустой очереди будет возвращать null
        System.out.println(myQueue.dequeue());


    }
}
