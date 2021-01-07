class Main {
  static String fizzBuzz(int i){
    if((i % 3 == 0) && (i % 5 == 0))
      return "fizzBuzz";
    if(i % 3 == 0)
      return "fizz";
    else if(i % 5 == 0)
      return "Buzz";
        
    return String.valueOf(i);    
  }
  public static void main(String[] args) {
    for(int i = 1; i< 20;i++){
      System.out.println(fizzBuzz(i));
    }
  }
}
