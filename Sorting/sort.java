package Sorting;

class Sorting {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};
        int i, j;

        for (i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    



    

