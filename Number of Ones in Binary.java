import java.lang.*;
import java.io.*;
import java.util.*;

class Main { 

  static String toBinary(int n){
    String result = "";
    while (n > 0) { 
        result += String.valueOf(n % 2); 
        n = n / 2; 
    }
    StringBuilder output = new StringBuilder();
    output.append(result);
    return String.valueOf(output.reverse());
  }

  static int numOnesinBinary(int x){
    int count = 0;
    while(x > 0){
      x = x & (x-1);
      System.out.println(x);
      count++;
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println(numOnesinBinary(4));
  }
}
