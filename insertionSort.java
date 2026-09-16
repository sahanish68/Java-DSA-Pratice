public class insertionSort {
    public static void main(String[] args) {

        int arr[] = {7, 8, 1, 3, 0};

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Placement of element
            arr[j + 1] = current;
        }

        // Printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}