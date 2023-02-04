package task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


// 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 4.Отсортировать по возрасту используя дополнительный список индексов.

public class work4 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("hd.txt");
            fw.append("Smirnov A. A. " + "30 "  + "M" + "\n");
            fw.append("Petrova U. S. " + "23 " + "W " + "\n" );
            fw.append("Ivanov I. I. " + "32 " + "M " + "\n");
            fw.append("Sinichkina M. D. " + "25 " + "W" + "\n");
            fw.append("Stolyarova D. M. " + "29 " + "W");
            fw.flush();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }   
        try{
            FileReader fr = new FileReader("hd.txt");
            StringBuilder str = new StringBuilder();
            while(fr.ready()){
                str.append((char)fr.read());
            }
            System.out.println(str);//Задание 1

            String[] strs = str.toString().split("\n");
            for (int i = 0; i < strs.length; i++) {
                System.out.println(strs[i]);//Задание 2
            }

            ArrayList <String> surname = new ArrayList<>();
            ArrayList <String> name = new ArrayList<>();
            ArrayList <String> patronymic = new ArrayList<>();
            ArrayList <Integer> age = new ArrayList<>();
            ArrayList <Boolean> gender = new ArrayList<>();
            ArrayList <Integer> index = new ArrayList<>();
            for (int i = 0; i < strs.length; i++) {
                String[] str1 = strs[i].split(" ");
                surname.add(str1[0] + " ");
                name.add(str1[1] + " "); 
                patronymic.add(str1[2] + " ");
                age.add((Integer.valueOf(str1[3])));
                gender.add(str1[4].contains("M") ? true : false);
                index.add(i);
            }
            System.out.println(surname);
            System.out.println(name);
            System.out.println(patronymic);
            System.out.println(age);
            System.out.println(gender);//Задание 3
  
            boolean sorted = false;
            int temp = 0;
            int temp2 = 0;
            while(!sorted){
                sorted = true;
                for (int i = 0; i < age.size() - 1; i++) {
                    if(age.get(i) > age.get(i+1)){
                        temp = age.get(i);
                        temp2 = index.get(i);
                        age.set(i, age.get(i+1));
                        index.set(i,index.get(i+1));
                        age.set(i+1,temp);
                        index.set(i+1,temp2);
                        sorted = false;
                    }
                }
            }
            System.out.println(age);
            System.out.println(index);
            ArrayList tempList = new ArrayList<>();
            for (int i = 0; i < index.size(); i++) {
                int count = index.get(i);
                tempList.add(surname.get(count));
                tempList.add(name.get(count));
                tempList.add(patronymic.get(count));
                tempList.add(age.get(i));
                tempList.add(gender.get(count) + "\n" );
            }
            System.out.println(tempList);//Задание 4
        }catch(IOException e){
            System.out.println(e.getMessage());
        }  
    }
}
