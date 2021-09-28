package ex24;
import java.util.Scanner;

/**
 * Anagram Checker
 * UCF cop3330 Fall 2021 Assignment 24 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class Anagram {

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            int[] frequency = new int[26];
            for(int i = 0; i < s1.length(); i++){
                frequency[s1.charAt(i) - 'a']++;
                frequency[s2.charAt(i) - 'a']--;
            }
            for(int j: frequency){
                if(j != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String s1, s2;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        s1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        s2 = scan.nextLine();

        if(isAnagram(s1, s2)){
            System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are anagrams.");
        }
        else{
            System.out.println("\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are not anagrams.");
        }
    }
}


