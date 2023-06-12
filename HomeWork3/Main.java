package HomeWork3;

import java.util.HashMap;

public class Main {
        public static void main(String[] args) {
        InformationPars parsData = new InformationPars(); 
        String newFileName = null; 
        FileWrite fileWrite = new FileWrite(); 

        HashMap<String, Object> data = parsData.parsInputData(); 
        while (data.size() != 6) {
            try {
                throw new ExceptionInformation();
            } catch (ExceptionInformation e) {
                data = parsData.parsInputData();
            }
        } 

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        fileWrite.writeInformation(String.valueOf(sb), filePath); // Вызывается метод для записи в файл

    }
}
