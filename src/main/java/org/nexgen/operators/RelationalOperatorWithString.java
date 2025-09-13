package org.nexgen.operators;

public class RelationalOperatorWithString {
  public static void main(String[] args) {
    char ch1 = 'A', ch2 = 'B';
    System.out.println("ch1 < ch2: " + (ch1 < ch2));  // true

    String s1 = "Java";
    String s2 = "Java";
    String s3 = new String("Java");

    System.out.println("s1 == s2: " + (s1 == s2));   // true (same reference)
    System.out.println("s1 == s3: " + (s1 == s3));   // false (different object)
    System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (content check)
  }
}