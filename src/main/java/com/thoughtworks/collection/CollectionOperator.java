package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list=new ArrayList<Integer>();
        for(int n : array){
            if (n%2==0){
                list.add(n);
            }
        }
        return list;
//        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        int last = array[array.length-1];
        return last;
//        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list=new ArrayList<Integer>();
        for(int first:firstArray){
            for (int second:secondArray){
                if (first == second){
                    list.add(first);
                }
            }
        }
        return list;
//        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
