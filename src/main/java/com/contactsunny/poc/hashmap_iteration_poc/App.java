package com.contactsunny.poc.hashmap_iteration_poc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        Map<String, String> mapForDemo = new HashMap<String, String>();
        mapForDemo.put("1", "Collection Iterator");
        mapForDemo.put("2", "ForEach loop with the keySet");
        mapForDemo.put("3", "ForEachRemaining with Collection Iterator");
        mapForDemo.put("4", "Streams on keySet");
        mapForDemo.put("5", "Stream.of() on keySet");

        demoUsingIterator(mapForDemo);
        demoUsingForEach(mapForDemo);
        demoUsingForEachRemaining(mapForDemo);
        demoStreamForEach(mapForDemo);
        demoStreamOfOnKeySet(mapForDemo);
    }

    private static void demoStreamOfOnKeySet(Map<String, String> mapForDemo) {
        System.out.println("Demo of Stream.of() on keySet");
        System.out.println("-----------------------------");
        Stream.of(mapForDemo.keySet().toArray()).forEach(key -> {
            String value = mapForDemo.get(key);
            System.out.println(key + " => " + value);
        });
        System.out.println("====================================================");
    }

    private static void demoStreamForEach(Map<String, String> mapForDemo) {
        System.out.println("Demo of the forEach loop in Streams");
        System.out.println("-----------------------------------");
        mapForDemo.keySet().stream().forEach(key -> {
            String value = mapForDemo.get(key);
            System.out.println(key + " => " + value);
        });
        System.out.println("====================================================");
    }

    private static void demoUsingForEachRemaining(Map<String, String> mapForDemo) {
        System.out.println("Demo of the forEachRemaining loop");
        System.out.println("---------------------------------");
        Iterator<String> iterator = mapForDemo.keySet().iterator();
        iterator.forEachRemaining(key -> {
            String value = mapForDemo.get(key);
            System.out.println(key + " => " + value);
        });
        System.out.println("====================================================");
    }

    private static void demoUsingForEach(Map<String, String> mapForDemo) {
        System.out.println("Demo of the forEach loop");
        System.out.println("------------------------");
        for (String key : mapForDemo.keySet()) {
            String value = mapForDemo.get(key);
            System.out.println(key + " => " + value);
        }
        System.out.println("====================================================");
    }

    private static void demoUsingIterator(Map<String, String> mapForDemo) {
        System.out.println("Demo of the iterator in Collection");
        System.out.println("----------------------------------");
        Iterator<String> iterator = mapForDemo.keySet().iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            String value = mapForDemo.get(key);
            System.out.println(key + " => " + value);
        }
        System.out.println("====================================================");
    }
}
