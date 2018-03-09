package javase.thinkINjava.chap13;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/7.
 */
public class StringDemo3 {
    public static void main(String[] args) {

     /*//格式化
       int x =65;
        double y=32.23232;
        System.out.println("["+x+","+y+"]");
        System.out.format("[%d,%f]\n",x,y);
        System.out.printf("[%d,%f]\n",x,y);*/
        //Split
        String s="1020304050";
        String []si=s.split("0");
        System.out.println(Arrays.toString(si));

        /*正则*/
        System.out.println("-1234".matches("-\\d+"));
    }
}
