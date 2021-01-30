import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.HashMap;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] arr) {
        int result  = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < n; i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else 
                map.put(arr[i],1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > 1)
                if(map.get(key) % 2 == 0)
                    result += map.get(key);
                else{
                    result += map.get(key) - 1;
                }
                    
        }
        return (int) result / 2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
