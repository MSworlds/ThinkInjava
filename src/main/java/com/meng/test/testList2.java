package com.meng.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public class testList2 {

    public static void main(String[] args) {
//        1
        List<person> list=new ArrayList<>();
        list.add(new japenese());
        list.add(new blackman());
//2

        List<chinese> list2= Arrays.asList(new yellowman(), new blackman());



    }
}
class person{}
class chinese extends  person{}
class japenese extends  person{}
class USA extends  person{}
class blackman extends chinese{}
class yellowman extends chinese{}

