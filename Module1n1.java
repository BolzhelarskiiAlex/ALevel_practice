import java.util.Arrays;

public class Module1n1 {
    public static void main(String[] args) {
        int[] array = {18, 4, 5, 18, 1, 1, 7, 3};
        System.out.println(Arrays.toString(array));
        int count = countNumberWithoutDuplicate(array);
        System.out.println("Count numbers: " + count);
    }

    static int countNumberWithoutDuplicate(int[] array) {
        int numbers = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count == 0) {
                numbers++;
            }
        }
        return numbers;
    }

}

