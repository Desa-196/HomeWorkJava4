/*
Задание

1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */

import java.util.LinkedList;

public class Task1{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = generateRandomArrayList(20,10,0);
        System.out.println(list);

        System.out.println(reversLinkedList(list));


    }

    public static LinkedList<Integer> generateRandomArrayList(int size, int max, int min) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i < size; i++){
            list.add((int)(Math.random()*(max - min + 1) + min));
        }
        return list;
    }


    public static LinkedList<Integer> reversLinkedList(LinkedList<Integer> list){

        LinkedList<Integer> reversList = new LinkedList<Integer>();

        for (Integer element : list) {
           reversList.addFirst(element);
        }

        return reversList;
    }
}