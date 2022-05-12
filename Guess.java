import java.util.*;  
import java.io.*;  
import java.awt.*;

public class Guess {
   private String word;
   
   public Guess(String word) {
      this.word = word;
   }
   
   public String result(String word, String guess) {
      String result = "";
      char[] resultarray = new char[5];
      char[] guessarray = new char[5];
      char[] wordarray = new char[5];
      
      for (int i = 0; i < 5; i++) {
         guessarray[i] = guess.charAt(i);  
         wordarray[i] = word.charAt(i);
      }
      
      for (int i = 0; i < 5; i++) {
         char currresult = '0';
         
         if (guessarray[i] == wordarray[i]) {
            currresult = guessarray[i];
            currresult = (char)(currresult - 32);
            resultarray[i] = currresult;
            guessarray[i] = '0';
            wordarray[i] = '0';
         }             
      }
      
      for (int i = 0; i < 5; i++) {
         guess = "";
         word = "";
         
         for(int j = 0; j < 5; j++) {
            guess += guessarray[j];  
            word += wordarray[j];
         }
         
         if (word.indexOf(guess.charAt(i)) != -1 && guess.charAt(i) != '0') {
            resultarray[i] = guess.charAt(i);
            guessarray[i] = '0';
            wordarray[word.indexOf(guess.charAt(i))] = '0';
         }
      }
      
      for (int i = 0; i < 5; i++) {
         if (guessarray[i] != '0') {
            resultarray[i] = '_';
         }
      }
      
      for (int i = 0; i < 5; i++) {    
         result += resultarray[i];
      }   
      /*
      result += "   ";
      for (int i = 0; i < 5; i++) {    
         result += guessarray[i];
      }
      result += "   ";
      for (int i = 0; i < 5; i++) {    
         result += wordarray[i];
      }
      */
      return result;  
   }    
}
 
   
