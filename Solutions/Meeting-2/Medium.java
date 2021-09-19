// Using a “while” loop: Add numbers starting from 0 to “a number” such that the sum of all integers between the two are greater than 200. Print the number. 

public class Medium {
  public static void main(String[] args) {
    int i = 0; 
    int sum = 0; 
    while (sum < 200) {
      sum += i; 
      i++; 
    }
    System.out.println(i);
  }
}


// Answer: 21
