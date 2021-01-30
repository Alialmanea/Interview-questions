import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.Object;

public class Solution {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // find the minIndex of element in Array
    static int minIndex(int arr[], int start, int end){
        int min = start;
        for(int i = start; i < end; i++){
            if(arr[i] < arr[min])
                min = i;
        }
        return min;
    }
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int minimumSwaps = 0;
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[minIndex(arr, i+1, arr.length)]){
                swap(arr, i,minIndex(arr, i+1, arr.length));
                minimumSwaps +=1;
            }
        }
        return minimumSwaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
