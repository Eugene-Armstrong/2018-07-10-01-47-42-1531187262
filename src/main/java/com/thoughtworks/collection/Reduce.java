package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
//        throw new NotImplementedException();
    }

    public double getMinimum() {
        return Collections.min(arrayList);
//        throw new NotImplementedException();
    }

    public double getAverage() {
        double sum = arrayList.stream().reduce(0, (a, b) -> a+b);
        return sum/arrayList.size();
//        throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        arrayList.stream().sorted();
        Integer[] a = arrayList.stream().toArray(Integer[]::new);
        double result;
        if(a.length%2!=0){
            result = a[a.length/2-1];
        }else{
            result = (a[a.length/2-1]+a[a.length/2])/2.0;
        }
        return result;
//        throw new NotImplementedException();
    }

    public int getFirstEven() {
        int result = 0;
        for(int i:arrayList){
            if(i%2==0){
                result = i;
                break;
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        int result = 0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i)%2==0){
                result = i;
                break;
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> objectList) {
        Boolean isEqual = false;
        if (objectList.size() == arrayList.size()) {
            isEqual = IntStream.range(0, arrayList.size())
                    .allMatch(index -> arrayList.get(index) == objectList.get(index));
        }
        return isEqual;
//        throw new NotImplementedException();
    }

    public double getMedianInLinkList(SingleLink<Integer> singleLink) {
        int index = arrayList.size() / 2;
        if (arrayList.size() % 2 == 0) {
            return (singleLink.getNode(index) + singleLink.getNode(index + 1)) / 2.0;
        } else {
            return singleLink.getNode(index + 1);
        }
    }

    public int getLastOdd() {
        int result = 0;
        for(int i=arrayList.size()-1;i>=0;i--){
            if(arrayList.get(i)%2!=0){
                result = arrayList.get(i);
                break;
            }
        }
        return result;
//        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        int result = 0;
        for(int i=arrayList.size()-1;i>=0;i--){
            if(arrayList.get(i)%2!=0){
                result = i;
                break;
            }
        }
        return result;
//        throw new NotImplementedException();
    }
}
