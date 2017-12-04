package com.meng.job;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017-12-03.
 */
public class TestTimer {
    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("循环吧");
            }
        }
        ,2000//启动后间隔时间
                ,1000//多久循环一次
        );
    }




}
