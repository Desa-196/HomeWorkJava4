/*
Задание

1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;

public class Main{
    public static void main(String[] args)
    {
        System.out.println(generateRandomArrayList(20,10,0));
    }

    public static LinkedList<Integer> generateRandomArrayList(int size, int max, int min) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i < size; i++){
            list.add((int)(Math.random()*(max - min + 1) + min));
        }
        return list;
    }
}