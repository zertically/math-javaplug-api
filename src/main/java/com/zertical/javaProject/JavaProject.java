package com.zertical.javaProject;

import org.bukkit.entity.Player;

import java.util.*;

public class JavaProject {

    public static void main(String[] args) {


        String array[] = new String[]{
                "Java", "Mikkel", "Isak"}; // JAVA = index 0, MIKKEL = index 1, ISAK = index 2

        List<String> list = new ArrayList<>();
 // test test test
        list.add("Java"); // index 0
        list.add("Mikkel"); // index 1

        HashMap<String, String> map = new HashMap<>();
        map.put("Nigga", "Tron"); // Nigga = key, Tron = value

        for (int i = 0; i < array.length; i++) {
            /* integer kaldt for "i", gives value 0, itereres gennem indtil array.length ikke er større end integer value,
             og integer value går op med +1 per iteration fordi vi siger i++
            */


        int funnylittleinteger = 0;
        while (funnylittleinteger < array.length) {
            funnylittleinteger++;
            System.out.println(array[funnylittleinteger]);
            /* while funnylittleinteger < array.length, while loopet går indtil funnylittleinteger er større end array.length,
             og funnylittleinteger går op med +1 per iteration fordi vi siger funnylittleinteger++
             */


            }
        }

        };


};