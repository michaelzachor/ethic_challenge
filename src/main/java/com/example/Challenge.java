package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Challenge {

  public boolean isPalindrome(String word) {
    return word.equals(new StringBuffer(word).reverse().toString());
  }

  public HashMap<String, String> challenge(String filename) {

    int charCount = 0;
    ArrayList<String> words = new ArrayList<>(); 
    HashMap<String, String> ret = new HashMap<String, String>();

    File inputFile;
    Scanner fileScan;

    try {
      inputFile = new File(filename);
      fileScan = new Scanner(inputFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return (null);
    }

    while (fileScan.hasNextLine()) {
      String line = fileScan.nextLine();
      // add each word from each nonempty line to the words list, without any punctuation
      if (line.length() > 0) {
          words.addAll(Arrays.asList(line.replaceAll("\\p{P}", "").split(" ")));
          charCount += line.length();
      }
    }

    fileScan.close();

    ret.put("char count",String.valueOf(charCount));
    ret.put("word count",String.valueOf(words.size()));

    words.removeIf(word -> !isPalindrome(word));
    ret.put("palindrome count",String.valueOf(words.size()));
    ret.put("palindrome list",words.toString());
    return ret;
  }

  public static void main(String args[]) { 
    String textFile = "words.txt";
    Challenge ch = new Challenge();
    System.out.println(ch.challenge(textFile));
  } 

}