package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int chk = left - right;
        int theLeft, theRight;
        Integer[] result;
        if(chk<0){
            result = new Integer[right-left+1];
            for(int i = 0; i<= right-left;i++){
                result[i] = left+i;
            }
        }else{
            result = new Integer[left-right+1];
            for(int i = 0; i<= right-left;i++){
                result[i] = left-i;
            }
        }
        List<Integer> resultList = Arrays.asList(result);
        return resultList;
//        throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
