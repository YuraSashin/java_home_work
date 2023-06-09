import java.util.Scanner;

public class HomeWork2_4 {
    public static void main(String[] args) {
        InputString();
    }
    private static void InputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String input = scanner.nextLine();
        String[] arr = input.split("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ""){
                System.out.println(input);
                break;
            }else{
                System.out.println("Нельзя вводить пустую строку");
                InputString();
            }
        } 
    }  
}