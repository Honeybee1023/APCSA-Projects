import java.util.*;
import java.io.*;

public class RyhmingWords
{
     public static void main(String[] args){
        // make sure you download wordlist.txt 
        List<String> words = readFile("wordlist.txt");
         
        System.out.println("Number of words input: " + words.size());
        System.out.println("The first word is: " + words.get(0));
        System.out.println("The last word is: " + words.get(words.size()-1));
        
        // your code here
        for (int i=0; i<words.size(); i++)
        {
            String str = words.get(i); 
            String newStr = "";
            char c;
            
            for (int j=0; j<str.length(); j++)
            {
                c= str.charAt(j);
                newStr= c+newStr;
            }
            
            words.set(i, newStr);
        }
        
        Collections.sort(words);
        
        for (int k=0; k<words.size(); k++)
        {
            String str = words.get(k); 
            String newStr = "";
            char c;
            
            for (int l=0; l<str.length(); l++)
            {
                c= str.charAt(l);
                newStr= c+newStr;
            }
            
            words.set(k, newStr);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        if (words.indexOf(word) != -1)
        {
            System.out.println("Words that rhyme with " + word);
            for (int a=0; a<=20; a++)
            {
                System.out.print(words.get(words.indexOf(word)-10+a) + " ");
            }
        }
        else
        {
            System.out.println ("Word not found.");
        }
     }
         
    
    
     /**
      * Reads in all words from a text file and returns it as a List of String objects
      */
     public static List<String> readFile(String fileName){
        // Location of file to read
        File file = new File(fileName);
        List<String> words = new ArrayList<>();
 
        try 
        {
 
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) 
            {
                words.add(scanner.nextLine());   
            }

            scanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        return words;
     }
}