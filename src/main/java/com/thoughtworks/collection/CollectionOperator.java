package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if(left<right){
            for(int i=left;i<=right;i++){
                resultList.add(i);
            }
        }else {
            for(int i=left;i>=right;i--){
                resultList.add(i);
            }
        }
        return resultList;
//        throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if(left<right){
            for(int i=left;i<=right;i++){
                resultList.add(i);
            }
        }else {
            for(int i=left;i>=right;i--){
                resultList.add(i);
            }
        }
        Integer[] result = resultList.stream().
                filter(n -> n%2 == 0).toArray(Integer[]::new);
        return Arrays.asList(result);
//        throw new NotImplementedException();
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
        List<Integer> list1 = Arrays.asList(firstArray);
        List<Integer> list2 = Arrays.asList(secondArray);

        List<Integer> reduce1 = list2.stream().filter(item -> !list1.contains(item)).collect(toList());
        list1.addAll(reduce1);
        System.out.println(list1.toString());
        return list1;
//        throw new NotImplementedException();
    }
}
