//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class HomeWork2_1 {
    public static void main(String[] args) {
        inputFloat();
    }

    private static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите дробное число");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректное значение");
                System.out.println("Введите дробное число");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            }
        }
    }
}
