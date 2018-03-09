package javase.thinkINjava.chap13;

/**
 * Created by Administrator on 2018/3/7.
 */
public class StringDemo1 {
    public static void main(String[] args) {
        String mango="mango";
        String s="abc"+mango+"def";
        System.out.println(s);
        StringBuilder result=new StringBuilder(s);
        System.out.println(result.length());
        result.delete(result.length()-2,result.length());

        System.out.println(result);
    }
}
