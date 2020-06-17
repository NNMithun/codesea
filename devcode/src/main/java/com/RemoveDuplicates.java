package com;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class RemoveDuplicates {



    public static void main(String[] args) {
        ArrayList<Integer> integers= new ArrayList<Integer>();
        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.add(1);
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        integers.add(4);

        removeDuplicates(null);

    }

    private  static  void removeDuplicates(List<Integer> list){
        TreeMap<Integer,Boolean> treeMap= new TreeMap<Integer, Boolean>();
        int lengthOfList=list.size();
        for (int index=0;index<lengthOfList;index++){
            if(!treeMap.containsKey(list.get(index))){
                treeMap.put(list.get(index),true);
            }
            else {
                list.remove(index);
                lengthOfList--;
                index--;
            }

        }
        //System.out.println(treeMap.keySet());
        System.out.println(list);

    }
    /*
    1. distinct elements input == output
    2. duplicates
    3.
    * */

}
