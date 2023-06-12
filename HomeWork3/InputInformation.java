package HomeWork3;
import java.util.Scanner;

public class InputInformation {
        public String[] InformationInput() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные (Ф.И.О, дату рождения(чч.мм.гггг), номер телефона, пол(f,m), через пробел на латинице ) : ");
            String data = scanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные");
            } else System.out.println("Вы ввели больше, чем требуется");
        }

    }
}
