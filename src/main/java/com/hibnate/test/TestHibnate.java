package com.hibnate.test;

import com.hibnate.vo.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.*;

/**
 * Created by Administrator on 2017/12/5.
 */
public class TestHibnate {
    public static void main(String[] args) {
        // 获取加载配置文件的管理类对象
        Configuration config = new Configuration();
        config.configure();  // 默认加载src/hibenrate.cfg.xml文件
        // 创建session的工厂对象
        SessionFactory sf = config.buildSessionFactory();
        // 创建session (代表一个会话，与数据库连接的会话)
        Session session = sf.openSession();
        // 开启事务
        Transaction tx = session.beginTransaction();
        //保存-数据库
/*Student stuq=new  Student();
        stuq.setName("meng");
        stuq.setSex(1);
session.save(stuq);*/
Student stu= (Student) session.get(Student.class,7);
        Set<String> adress=new HashSet<String>();
        adress.add("安徽");
        adress.add("合肥");
        stu.setAdress(adress);



        List<String> adress2=new ArrayList<String>();
        adress2.add("淮北");
        adress2.add("濉溪");
        stu.setAdress2(adress2);


        Map<String,String> adress3=new HashMap<String, String>();
        adress3.put("家","新加坡");
        adress3.put("公司","Daaaa");

        stu.setAdress3(adress3);

       /* Student stu= (Student) session.load(Student.class, 1);
 Query q=session.createQuery("from Student where name=?");
        q.setParameter(0,"jack");
        List<Student> stus= (List<Student>)q.list();
        System.out.println(stus.toString());*/


        // 提交事务
        tx.commit();
        // 关闭
        session.close();
        sf.close();
    }
}

