package com.meng.job;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/4.
 */
public class SpringQuartzTask {
    public void doSimpleTriggerTask() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("doing simpleTrigger task..." + sdf.format(new Date()));
    }

    public void doCronTriggerTask() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("doing cronTrigger task..." + sdf.format(new Date()));
    }

}
