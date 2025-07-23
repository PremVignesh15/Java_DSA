import java.util.*;
class IsSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
