package day2.exercise3;

import java.util.HashSet;
import java.util.Set;

public class ChatApplication {

    Set<String> filteredWord = new HashSet<>();


    ChatApplication() {
        filteredWord.add("idiot");
        filteredWord.add("stupid");
    }

    public static void main(String[] args) {
        String s1 = "shut up you idiot";
        String s2 = "you are stupid";

        ChatApplication chatApplication = new ChatApplication();

        System.out.println(chatApplication.censorSenteces(s1));
        System.out.println(chatApplication.censorSenteces(s2));

    }

    public String replaceFilteredWords(int filterLength) {
        String censoredWord = "";
        for (int i = 0; i < filterLength; i++) {
            censoredWord += "*";
        }
        return censoredWord;
    }

    public String censorSenteces(String sencence) {
        String censoredSentence = "";

        String[] wordsInSentence = sencence.split(" ");
        for (String word : wordsInSentence) {
            if (filteredWord.contains(word)) {
                censoredSentence += replaceFilteredWords(word.length());
            } else {
                censoredSentence += word + " ";
            }
        }

        return censoredSentence;
    }

}
