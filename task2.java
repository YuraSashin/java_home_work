// 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3 *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6 *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7 **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
public class task2 {
    public static void main(String[] args) {

        String str1 = "Привет мир!";
        String str2 = "мир";
        String str3 = "каша";
        int index1 = str1.indexOf(str2); 
        int index2 = str1.indexOf(str3); 
        if(index1 >= 0){
            System.out.println("Подстрока найдена");
        }else{
            System.out.println("Подстрока не найдена");
        }
        if(index2 >= 0){
            System.out.println("Подстрока найдена");
        }else{
            System.out.println("Подстрока не найдена");
        }// Задание 1

        StringBuffer sb = new StringBuffer();
        sb.append("!рим тевирП");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.toString().equals(str1));//Задание 2
        
        int a = 3;
        int b = 56;
        StringBuffer sum = new StringBuffer();
        sum.append(a).append(" + ").append(b).append(" = ").append(a+b);
        System.out.println(sum);//Задание 4
        int index = sum.indexOf("=");
        sum.deleteCharAt(index).insert(index, "равно");
        System.out.println(sum);//Задание 5 (пример 1)
        
        StringBuffer difference = new StringBuffer();
        difference.append(a).append(" - ").append(b).append(" = ").append(a-b);
        System.out.println(difference);//Задание 4
        int ind = difference.indexOf("=");
        difference.deleteCharAt(ind).insert(ind, "равно");
        System.out.println(difference);//Задание 5(пример2)
        
        StringBuilder mult = new StringBuilder();
        mult.append(a).append(" * ").append(b).append(" = ").append(a*b);
        System.out.println(mult);//Задание 4
        System.out.println(mult.replace(7,8,"равно"));//Задание 6

        String str4 = "3 + 56 = 59";
        for (int i = 0; i <10_000; i++) {
            str4+= "=";
        }
        long start = System.currentTimeMillis();
        String strr = str4.replace("=", "равно");
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        StringBuffer str5 = new StringBuffer();
        str5.append(a).append(" + ").append(b).append(" = ").append(a+b);
        for (int i = 0; i < 10_000; i++) {
            str5.append("=");
        }
        int index3 = str5.indexOf("=");
        long start1 = System.currentTimeMillis();
        str5.deleteCharAt(ind).insert(index3, "равно");
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);//Задание 7
    }
}
