import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// 1 Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// 2 Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3 Вставить элемент в список в первой позиции.
// 4 Извлечь элемент (по указанному индексу) из заданного списка.
// 5 Обновить определенный элемент списка по заданному индексу.
// 6 Удалить третий элемент из списка.
// 7 Поиска элемента в списке по строке.
// 8 Создать новый список и добавить в него несколько елементов первого списка.
// 9 Удалить из первого списка все элементы отсутствующие во втором списке.
// 10 *Сортировка списка.

public class task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Мир");
        list.add("Котик");
        list.add("Табурет");
        list.add("Молоко");
        System.out.println(list);//Задание 1

        for (int i = 0; i < list.size(); i++) {
            String strs = list.get(i);
            strs+= "!";
            list.set(i,strs);
        }
        System.out.println(list);//Задание 2

        list.add(0, "Дерево");
        System.out.println(list);//Задание 3

        String str1 = list.get(0);
        System.out.println(str1);//Задание 4
        
        list.set(0, "Берёза");
        System.out.println(list);//Задание 5

        list.remove(2);
        System.out.println(list);// Задание 6

        String str2 = "Котик!";
        int temp = list.indexOf(str2);
        if (temp != -1){
            System.out.println(list.get(temp));
        }else{
            System.out.println("Данной строки нет в списке");
        }//Задание 7

        List<String> list2 = new ArrayList<>();
        list2.add(list.get(0));
        list2.add(list.get(2));
        list2.add(list.get(4));
        System.out.println(list2);//Задание 8

        list.retainAll(list2);
        System.out.println(list);//Задание 9

        List<Integer> list3 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list3.add(rnd.nextInt(20));
        }
        System.out.println(list3);
        
        list3.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1){
                return t0-t1;
            }
        });
        System.out.println(list3);//Сортировка по возрастанию
        
        list3.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1){
                return t1-t0;
            }
        });
        System.out.println(list3);//Сортировка по убыванию
    }//Задание 10
    }

