import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _03_CountCharTypes {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int punctuations = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/words.txt"))) {
            String line = reader.readLine().replaceAll("\\s+","").toLowerCase();
           List<Character> vowelsContainer = Arrays.asList('a','i','e','o','u');
           List<Character> punctuationMarks = Arrays.asList('!','.',',','?');



            while (line != null) {

                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    if (vowelsContainer.contains(currentChar)){
                        vowels++;
                    }else if(punctuationMarks.contains(currentChar)){
                        punctuations++;
                    }else if(currentChar >= 97 && currentChar <= 122){
                          consonants++;
                    }
                }

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Vowels: %d%n",vowels);
        System.out.printf("Consonants: %d%n",consonants);
        System.out.printf("Punctuation: %d%n",punctuations);

    }
}
