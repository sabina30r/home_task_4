package nix.edu;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class StringUtil {

    String inputString;

    StringUtil() throws IOException {
        File file = new File("string-util/src/resources/file.txt");
        try {
           inputString = FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Character,Integer> sortedCharacterCount() {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();

        for (char character : strArray) {
            if(charCountMap.containsKey(character)) { charCountMap.put(character, charCountMap.get(character)+1); }
            else { charCountMap.put(character, 1); }
        }
        charCountMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        return charCountMap;
    }

    public Map<String, Integer> sortedWordsCount() {
        Map<String, Integer> wordsCountMap = new HashMap<>();
        String[] strArray = inputString.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String word : strArray) {
            if (wordsCountMap.containsKey(word)) {
                wordsCountMap.put(word, wordsCountMap.get(word) + 1);
            } else {
                wordsCountMap.put(word, 1);
            }
        }
        wordsCountMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        return wordsCountMap;
    }

    public void  reverseString(){
        String[] strArray = inputString.split("\\s");
        String reversedString = "";

        for (int i = 0; i < strArray.length; i++) {
            if (i == strArray.length - 1)
                reversedString = strArray[i] + reversedString;
            else
                reversedString = " " + strArray[i] + reversedString;
        }
        System.out.println("Reversed string : " + reversedString);
    }
}



