import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.println("nhap size mang");
        a = scanner.nextInt();
        int[] inputArray = new int[a];
        System.out.println("nhap cac gia tri trong mang");
        for (int i = 0; i < a; i++) {
            System.out.println("inputArray[" + i + "]=");
            inputArray[i] = scanner.nextInt();
        }
        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
        System.out.println("nhap so can im kiem");
        int value1 = scanner.nextInt();
        System.out.println(binarySearch(inputArray,value1,0,inputArray.length));

    }
    public static int binarySearch(int[] arr, int value, int left, int right) {
        left = 0;
        right = arr.length - 1;
        int mid = (left + right) / 2;
        if (right >= left) {
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, value, left, mid - 1);
            } else if (arr[mid] < value) {
                return binarySearch(arr, value, mid + 1, right);
            }
        }
        return -1;
    }


}