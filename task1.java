// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)


import java.util.Random;

public class task1{
    public static void main(String[] args) {
    int i = new Random().nextInt(2001); // Задание 1
    System.out.println(i);
    int n = Integer.toBinaryString(i).length();//Задание 2
    System.out.println(n);
    int max = Short.MAX_VALUE;
    int max1 = max;
    int min = Short.MIN_VALUE;
    int min1 = min;
    System.out.println(max);
    System.out.println(min);
    int count = 0;
    while(max>i){
        if(max%n == 0){
            count++;
        }
        max--;
    }
    // System.out.println(count);
    int[] m1 = new int [count];
    int j = 0;
    while(max1>i){
        if(max1%n == 0){
            m1[j] = max1;
            j++;
        }
        max1--;
    }
    // System.out.println(m1[0]); Задание 3
    int counter = 0;
    while(min<i){
        if(min%n != 0){
            counter++;
        }
        min++;
    }
    // System.out.println(counter);
    int[] m2 = new int[counter];
    int k = 0;
    while (min1<i) {
        if(min1%n !=0){
            m2[k] = min1;
            k++;
        }
        min1++;
    }
    // System.out.println(m2[0]); Задание 4
    }
}