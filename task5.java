import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.TreeMap;

// 1 Создать словарь HashMap. Обобщение <Integer, String>.
// 2 Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!)
// 3 Изменить значения дописав восклицательные знаки.
// 4 *Создать TreeMap, заполнить аналогично.
// 5 *Увеличить количество элементов до 1000 случайными ключами и общей строкой.
// 6 **Сравнить время последовательного и случайного перебора тысячи элементов словарей.

public class task5 {
    public static void main(String[] args) {
        
        HashMap <Integer,String > map = new HashMap<>();// Задание 1

        map.put(0, "Белый");
        map.put(1,"Синий");
        map.put(2, "Красный");
        System.out.println(map);//Задание 2

        Iterator<String> iterator = map.values().iterator();
        int i = 0;
        while(iterator.hasNext()){
            String tmp = iterator.next();
            tmp += "!";
            map.put(i, tmp);
            i++;
        }
        System.out.println(map);//Задание 3

        TreeMap <Integer, String> tmap = new TreeMap<>();
        tmap.put(0, "Белый");
        tmap.put(1, "Синий");
        tmap.put(2, "Красный");
        System.out.println(tmap);//Задание 4

        Random rnd = new Random();
        for (int j = 3; j < 1000; j++) {
            tmap.put(rnd.nextInt(10_000), "Жёлтый");
        }//Задание 5

        long start1 = System.currentTimeMillis();
        Iterator<String> iterator2 = tmap.values().iterator();
        int count = 0;
        while(iterator2.hasNext()){
            iterator2.next();
            count++;
        }
        System.out.println(count);
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

        LinkedHashMap <Integer,String> lhmap = new LinkedHashMap<>();
        for (int j = 0; j < tmap.size(); j++) {
            lhmap.put(j, "Зелёный");
        }
        long start2 = System.currentTimeMillis();
        Iterator<String> iterator3 = lhmap.values().iterator();
        int counter = 0;
        while(iterator3.hasNext()){
            iterator3.next();
            counter++;
        }
        System.out.println(counter);
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);
   }

}
