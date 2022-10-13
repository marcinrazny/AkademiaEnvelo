public class Search {

    private static boolean searchx(int[] numbers, int x) {

        boolean a = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == x) {

                a = true;
            }
        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {

        int[] numbers = {60, 55, 34, 23, 14, 5, 4, 3, 2, 1};
        searchx(numbers, 8);
    }
}
