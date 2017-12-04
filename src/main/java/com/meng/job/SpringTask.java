package com.meng.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017-12-04.
 */
@Component
public class SpringTask {

    public  void  testTask(){
        System.out.println("Spring 内置job");

    }


    @Scheduled(cron = "0/5 * * * * ?")
    public void TaskJob() {
        System.out.println("注解产生job注解产生job");
    }
}
