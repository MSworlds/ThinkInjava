package com.meng.test;

import java.util.*;

/**
 * Created by Administrator on 2017/12/12.
 */
public class TestList {
    public static void main(String[] args) {
        Collection<Integer> colllection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(colllection.toArray());
        Collections.addAll(new ArrayList<Object>() ,colllection);
        List list=Arrays.asList(1,2,3,4);
//        list.add(123);会报错  asList  方法底层还是数组不可变
        System.out.println(list.toString());

Queue q=new LinkedList();




    }
}
