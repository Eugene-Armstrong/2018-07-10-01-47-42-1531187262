package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> resultList = new ArrayList<>();
        for(int i =0;i<array.length;i++){
            for (Integer n:array[i]){
                resultList.add(n);
            }
        }
        return resultList;
//        throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList;
        for(int i =0;i<array.length;i++){
            for (Integer n:array[i]){
                list.add(n);
            }
        }
        resultList = list.stream().distinct().collect(Collectors.toList());
        return resultList;
//        throw new NotImplementedException();
    }
}
