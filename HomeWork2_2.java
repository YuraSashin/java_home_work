// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }
 
public class HomeWork2_2 {
    public static void main(String[] args) {
        Code();
    }

    private static void Code() {
        try {
            int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
            int d = 0;
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        }
    }

}
