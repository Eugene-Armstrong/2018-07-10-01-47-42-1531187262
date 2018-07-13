package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//        List<String> result = new ArrayList<>();
//        for(int i : array){
//            if(i<=26){
//                result.add(letters[i]);
//            }else{
//                int n = i/26;
//                String str = "";
//                for (int j=0;j<n;j++){
//                    str += j==0?letters[i%26-1]:letters[0];
//                }
//                result.add(str);
//            }
//        }
////        List<String> result = array.stream().
////                map(n -> n<=26?letters[n-1]:letters[n%26-1]).
////                collect(Collectors.toList());
//        return result;

        return array.stream().map(num -> {
            num = num - 1;
            int letterSize = letterList.size();

            String resultStr;
            if (num >= letterSize) {
                int baseLocateNum = num % letterSize;
                int MultipleLocateNumLocateNum = num / (letterSize) - 1;
                resultStr = letterList.get(MultipleLocateNumLocateNum) + letterList.get(baseLocateNum);
            } else {
                resultStr = letterList.get(num);
            }
            return resultStr;

        }).collect(Collectors.toList());
//        throw new NotImplementedException();
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
