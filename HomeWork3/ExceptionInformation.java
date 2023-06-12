package HomeWork3;

public class ExceptionInformation extends Exception {
        public ExceptionInformation() {
    }

    public void InformationException(String i) {
        System.out.println("Exception: InformationNotCorrectFormat");
        System.out.printf("Неверный формат: %s", i);
        System.out.println();
    }
}
