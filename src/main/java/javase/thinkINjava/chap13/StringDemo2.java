package javase.thinkINjava.chap13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/7.
 */
public class StringDemo2 {
    @Override
    public String toString(){
        return " "+this;
    }
    public static void main(String[] args) {
     /*   System.out.println(new StringDemo2().toString());*/
        //会递归 ""+ this  this会转换为sting    调用tosting方法
        List list=new ArrayList();
        list.add(1);
        list.add(1);
        System.out.println(list);
    }
}
