# Ethic Software Engineering Intern Coding Challenge

## How to compile and run the application
The application can be found in 

```/src/main/java/com/example/Challenge.java```

Unit testing can be found in 

```/src/test/java/com/example/ChallengeTest.java```

To compile application, from the root of the repository run the command ```make compile```

To run application, from the root of the repository run the command ```make run```

Unit testing must be compiled and run in an IDE. (Note: This is my first time implementing unit testing. I was able to implement it and compile and run it in my IDE, but was unable to figure out how to compile and run it in the commmand line because of issues with the pom.xml and .jar files. Apologies, and if you have any tips on how to do that, that would be greatly apreciated!)

## Assumptions made while writing the source code, known limitations, other info

- Palindromes are not case sensitive
- 1- and 2-letter words count as palindromes
- Empty paragraphs, e.g. an extra line between two paragraphs, are not counted as characters
- Punctuation marks are included in the character count but excluded when checking if the string is a palindrome, e.g. "noon" and "noon," are both palindromes
- Several text files are included in the text_files folder for testing and can replace "words.txt" as the value of ```textFile``` in main()