public class HomeWork1_2 {
    public static int Sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
          }
        }
      return sum;
      }
      public static void main(String[] args) {
        String[][] array = new String[][]{
            {"a","e","b","c","a"},
            {"e","c","b","a"}
        };
        
        int result = Sum2d(array);
      }
}

