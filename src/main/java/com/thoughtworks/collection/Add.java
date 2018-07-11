package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        int chk = leftBorder - rightBorder;
        int theLeft, theRight;
        if(chk<0){
            theLeft = leftBorder;
            theRight = rightBorder;
        }else{
            theLeft = rightBorder;
            theRight = leftBorder;
        }
        for(int i=theLeft; i<=theRight; i++){
            if(i%2==0){
                sum += i;
            }
        }
        return sum;
//        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        int chk = leftBorder - rightBorder;
        int theLeft, theRight;
        if(chk<0){
            theLeft = leftBorder;
            theRight = rightBorder;
        }else{
            theLeft = rightBorder;
            theRight = leftBorder;
        }
        for(int i=theLeft; i<=theRight; i++){
            if(i%2!=0){
                sum += i;
            }
        }
        return sum;
//        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        List<Integer> sums = arrayList.stream().
                map(n -> 3 * n + 2).
                collect(Collectors.toList());
        int result = 0;
        for(int s :sums){
            result += s;
        }
        return result;
//        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> sums = arrayList.stream().
                map(n -> n%2!=0?3*n+2:n).
                collect(Collectors.toList());
        return sums;
//        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        List<Integer> sums = arrayList.stream().
                map(n -> n%2!=0?3*n+5:0).
                collect(Collectors.toList());
        int result = 0;
        for(int s :sums){
            result += s;
        }
        return result;
//        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        arrayList.stream().sorted();
        Integer[] evens = arrayList.stream().
                filter(n -> n%2 == 0).toArray(Integer[]::new);
        double result;
        if(evens.length%2!=0){
            result = evens[evens.length/2-1];
        }else{
            result = (evens[evens.length/2-1]+evens[evens.length/2])/2;
        }
        return result;
//        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double sum = 0, count = 0;
        for(int al : arrayList){
            if(al%2==0){
                sum += al;
                count++;
            }
        }
        return sum/count;
//        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        Integer[] evens = arrayList.stream().
                filter(n -> n%2 == 0).toArray(Integer[]::new);
        return Stream.of(evens).anyMatch(n -> n == specialElment);
//        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> tmp = arrayList.stream().
                distinct().collect(Collectors.toList());

        Integer[] evens = tmp.stream().
                filter(n -> n%2 == 0).toArray(Integer[]::new);

        return Arrays.asList(evens);
//        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        Integer[] evens = arrayList.stream().
                filter(n -> n%2 == 0).toArray(Integer[]::new);
        Integer[] odds = arrayList.stream().
                filter(n -> n%2 != 0).toArray(Integer[]::new);
        Arrays.sort(evens);
        Arrays.sort(odds);
        Collections.reverse(Arrays.asList(odds));
        List<Integer> resultList = new ArrayList(Arrays.asList(evens));
        resultList.addAll(Arrays.asList(odds));
        return resultList;
//        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        Integer[] result = new Integer[arrayList.size()-1];
        for(int i=0;i<arrayList.size()-1;i++){
            result[i] = 3*(arrayList.get(i)+arrayList.get(i+1));
        }
        List<Integer> resultList = Arrays.asList(result);
        return resultList;
//        throw new NotImplementedException();
    }
}
