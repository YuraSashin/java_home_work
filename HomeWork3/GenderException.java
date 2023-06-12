package HomeWork3;

public class GenderException extends Exception {
        public GenderException() {
    }

    public void ExceptionGender(String i) {
        System.out.println("Exception: GenderNotCorrectData");
        System.out.printf("Указана некорректная информация: %s", i);
        System.out.println();
    }
}
