package com.ms.mspa.interview.java.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        Arrays.stream(funWithAnagrams(new String[]{"code", "doce", "ecod", "framer", "frame"}))
                .forEach(System.out::println);
    }

    private static String [] funWithAnagrams(String [] input){
        //TODO implement the logic here
        HashSet<String> hashSet = new HashSet<String>();
        ArrayList<String> list = new ArrayList<String>();

        for(String s : input) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String finalS = new String(c);
            if(!hashSet.contains(finalS)) {
                hashSet.add(finalS);
                list.add(s);
            }
        }

        String[] a = new String[list.size()];

        for(int i =0;i<list.size();i++) {
            a[i]= list.get(i);
        }

        Arrays.sort(a);

        return a;


    }

}
