import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> queue = new LinkedList<Integer>();

    /*помещает элемент в конец очереди */
    public void enqueue(int element){
        queue.addLast(element);
    }
    /*возвращает первый элемент из очереди и удаляет его */
    public Integer dequeue(){
        if(queue.size() > 0){
            int first = queue.getFirst();
            queue.removeFirst();
            return first;
        }
        return null;
    }
    /*возвращает первый элемент из очереди, не удаляя */
    public Integer first(){
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
