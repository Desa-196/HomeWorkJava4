import java.util.LinkedList;

public class MyQueue <T> {
    private LinkedList<T> queue = new LinkedList<T>();

    /*помещает элемент в конец очереди */
    public void enqueue(T element){
        queue.addLast(element);
    }
    /*возвращает первый элемент из очереди и удаляет его */
    public T dequeue(){
        if(queue.size() > 0){
            T first = queue.getFirst();
            queue.removeFirst();
            return first;
        }
        return null;
    }
    /*возвращает первый элемент из очереди, не удаляя */
    public T first(){
        if(queue.size() > 0){
            return queue.getFirst();
        }
        return null;
    }
    /*Для вывода в консоль */
    public String toString(){
        return queue.toString();
    }
}
