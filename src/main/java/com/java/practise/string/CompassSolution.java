package com.java.practise.string;

import java.util.ArrayList;
import java.util.List;

public class CompassSolution {

/*
We are building a word processor and we would like to implement a "reflow" functionality that also applies full justification to the text.
Given an array containing lines of text and a new maximum width, re-flow the text to fit the new width. Each line should have the exact specified width. If any line is too short, insert '-' (as stand-ins for spaces) between words as equally as possible until it fits.
Note: we are using '-' instead of spaces between words to make testing and visual verification of the results easier.


lines = [ "The day began as still as the",
          "night abruptly lighted with",
          "brilliant flame" ]

reflowAndJustify(lines, 24) ... "reflow lines and justify to length 24" =>

        [ "The--day--began-as-still",
          "as--the--night--abruptly",
          "lighted--with--brilliant",
          "flame" ] // <--- a single word on a line is not padded with spaces

reflowAndJustify(lines, 26) ... "reflow lines and justify to length 26" =>

        [ "The--day-began-as-still-as",
          "the-night-abruptly-lighted",
          "with----brilliant----flame" ]

reflowAndJustify(lines, 40) ... "reflow lines and justify to length 40" =>

        [ "The--day--began--as--still--as-the-night",
          "abruptly--lighted--with--brilliant-flame" ]

n = number of words OR total characters
*/


    public static List<String> getListOfWords(String[] words, int width) {
        System.out.println("===");
        List<String> output = new ArrayList<>();
        String sentence = "";
        int index = 0;
        int initialLength = 0;
        while (index < words.length) {

            if (sentence.length() == 0) {
                sentence += words[index];
                index++;
            } else {
                if (sentence.length() + words[index].length() + 1 <= width) {
                    sentence += "-" + words[index];
                    index++;
                } else {
                    output.add(sentence);
                    sentence = "";
                }
            }
        }
        if (sentence.length() > 0) {
            output.add(sentence);
        }

        for (String outputString : output) {
            System.out.println(outputString);
        }
        return output;
    }


    public static void justifyTheSentence(String[] lines, int width) {
        for (String line : lines) {
            String[] numberOfWords = line.split(" ");
            int numberOfSpaces = numberOfWords.length - 1;
            int numberOfDashes = (line.length());
            String sentence = "";
            for (String word : numberOfWords) {

            }
        }
    }

    public static void main(String[] argv) {
        String[] lines = {"The day began as still as the", "night abruptly lighted with", "brilliant flame"};
        int testReflowWidth1 = 24;
        int testReflowWidth2 = 26;
        int testReflowWidth3 = 40;

    }
}