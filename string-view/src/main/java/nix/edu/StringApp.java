package nix.edu;

import java.io.IOException;

public class StringApp {
    public static void main(String[] args) throws IOException {
        StringUtil stringUtil = new StringUtil();
        System.out.println("Sorted Count Of Chars: ");
        stringUtil.sortedCharacterCount();
        System.out.println("Sorted Count Of Words");
        stringUtil.sortedWordsCount();
        stringUtil.reverseString();
    }
}

