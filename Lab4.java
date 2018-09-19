import java.util.Arrays;

public class Lab4 {

    public static Integer[] sort(Integer[] intArray) {
        Integer[] sortedArray = null;
        try {
            sortedArray = intArray.clone();


            int count = intArray.length - 1;
            for (int i = 0; i < intArray.length; i++) {
                sortedArray[i] = intArray[count];
                count--;
            }
        } catch(NullPointerException e) {
            System.out.println("Empty Array");
        }

        return sortedArray;

    }

    public static void main(String[] args) {
        Integer[] unsortedArray = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(sort(unsortedArray)));

        Integer[] unsortedArray2 = null;

        System.out.println(Arrays.toString(sort(unsortedArray2)));
    }

}
