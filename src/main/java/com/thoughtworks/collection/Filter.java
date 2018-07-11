package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        Integer[] evens = array.stream().
                filter(n -> n%2 == 0).toArray(Integer[]::new);
        return Arrays.asList(evens);
//        throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        Integer[] result = array.stream().
                filter(n -> n%3 == 0).toArray(Integer[]::new);
        return Arrays.asList(result);
//        throw new NotImplementedException();
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        for (int first : firstList) {
            for(int second : secondList){
                if (first == second) {
                    result.add(first);
                }
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = new ArrayList<>();
        for (int a : array) {
            boolean chk = result.stream().anyMatch(n -> n==a);
            if (!chk) {
                result.add(a);
            }
        }
        return result;
//        throw new NotImplementedException();
    }
}