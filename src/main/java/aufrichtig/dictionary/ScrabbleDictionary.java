package aufrichtig.dictionary;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ScrabbleDictionary {
    public boolean isValid(String word) throws FileNotFoundException {
        File file = new File("dictionary.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> dictArray = new ArrayList<String>();

        while(scanner.hasNext()) {
            dictArray.add(scanner.next());
            scanner.nextLine();
        }

        for(String nextWord : dictArray){
            if(nextWord.equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }
}