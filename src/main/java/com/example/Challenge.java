package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.*;

class Challenge {

  public boolean isPalindrome(String word) {
    return word.equals(new StringBuffer(word).reverse().toString());
  }

  public String challenge(String filename) {
      try {
        ArrayList<String> words = new ArrayList<>(); 
        int wordCount; 
        int charCount = 0;
        int palindromeCount;
        String ret;
  
        File inputFile = new File(filename);
        Scanner fileScan = new Scanner(inputFile);
  
        while (fileScan.hasNextLine()) {
          String line = fileScan.nextLine();
          if (line.length() > 0) {
              words.addAll(Arrays.asList(line.replaceAll("\\p{P}", "").split(" ")));
              charCount += line.length();
          };
        }
        wordCount = words.size();
        words.removeIf(word -> !isPalindrome(word));
        palindromeCount = words.size();
  
        ret = "word count: " + wordCount
              + "\ncharacter count: " + charCount
              + "\npalindrome count: " + palindromeCount
              + "\npalindrome list: " + words;
        System.out.println(ret);
      //   System.out.println("word count: " + wordCount);
      //   System.out.println("character count: " + charCount);
      //   System.out.println("palindrome count: " + palindromeCount);
      //   System.out.println("palindrome list: " + words);
        fileScan.close();
        return ret;
      } catch (FileNotFoundException e) {
        System.out.println("No file found.");
        e.printStackTrace();
        return("No file found.");
      }
  }

  public static void main(String args[]) { 
    Challenge ch = new Challenge();
    ch.challenge("words.txt");
  } 

}