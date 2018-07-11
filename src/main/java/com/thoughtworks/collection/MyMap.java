package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = array.stream().
                map(n -> n * 3).
                collect(Collectors.toList());
        return result;
//        throw new NotImplementedException();
    }

    public List<String> mapLetter() {
        List<String> result = array.stream().
                map(n -> letters[n-1]).
                collect(Collectors.toList());
        return result;
//        throw new NotImplementedException();
    }

    public List<String> mapLetters() {
        throw new NotImplementedException();
    }

    public List<Integer> sortFromBig() {
        Integer[] newA = array.stream().toArray(Integer[]::new);
        Arrays.sort(newA);
        Collections.reverse(Arrays.asList(newA));
        return Arrays.asList(newA);
//        throw new NotImplementedException();
    }

    public List<Integer> sortFromSmall() {
        Integer[] newA = array.stream().toArray(Integer[]::new);
        Arrays.sort(newA);
        return Arrays.asList(newA);
//        throw new NotImplementedException();
    }
}
