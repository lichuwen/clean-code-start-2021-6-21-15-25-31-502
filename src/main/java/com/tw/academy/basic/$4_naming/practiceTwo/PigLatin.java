package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String sentence) {
        String[] punctuations = {".",",","-",":",";","!","?"};
        String[] words = sentence.split(" ");
        char firstWord;
        boolean flag = true;

        for (int i = 0; i < words.length; i++){
            for (String punctuation : punctuations){
                if (words[i].contains(punctuation)) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                firstWord = words[i].charAt(0);
                words[i] = words[i].substring(1);
                words[i] = words[i].replace(words[i], words[i] + firstWord + "ay");
            }
            flag = true;
        }

        return String.join(" ", words);
    }
}
