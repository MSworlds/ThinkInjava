package com.meng.job;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/4.
 */
public class TestQuartz {
    public static void main(String[] args) throws SchedulerException, InterruptedException {


//        sim();
        con();
    }

    public static void sim() throws SchedulerException {
        // 创建工厂
        SchedulerFactory schedulerfactory = new StdSchedulerFactory();
        Scheduler scheduler = null;

        // 通过schedulerFactory获取一个调度器
        scheduler = schedulerfactory.getScheduler();

        // 指明job的名称，所在组的名称，以及绑定job类
        JobDetail job =new JobDetail("job1", "jgroup1", Myjob.class);
        // 定义触发的条件
        SimpleTrigger simpleTrigger=new SimpleTrigger("simpleTrigger","triggerGroup");

        //       马上启动
        simpleTrigger.setStartTime(new Date());
//       间隔时间
        simpleTrigger.setRepeatInterval(1000);
//       运行次数从零开始
        simpleTrigger.setRepeatCount(1);

//       把作业和触发器注册到任务调度中
        scheduler.scheduleJob(job, simpleTrigger);

//       启动调度
        scheduler.start();
    }
    public  static  void con(){
        //通过schedulerFactory获取一个调度器
        SchedulerFactory schedulerfactory=new StdSchedulerFactory();
        Scheduler scheduler=null;
        try{
//      通过schedulerFactory获取一个调度器
            scheduler=schedulerfactory.getScheduler();

//       创建jobDetail实例，绑定Job实现类
//       指明job的名称，所在组的名称，以及绑定job类
            JobDetail jobDetail=new JobDetail("job1", "jgroup1", Myjob.class);

//       定义调度触发规则，每天上午10：15执行
            CronTrigger cornTrigger=new CronTrigger("cronTrigger","triggerGroup");
//       执行规则表达式
            cornTrigger.setCronExpression("12/3 * * * * ? *");
//       把作业和触发器注册到任务调度中
            scheduler.scheduleJob(jobDetail, cornTrigger);

//       启动调度
            scheduler.start();


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}


