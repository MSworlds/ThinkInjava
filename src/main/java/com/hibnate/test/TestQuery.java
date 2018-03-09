package com.hibnate.test;

import com.hibnate.vo.Student;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.*;

/**
 * Created by Administrator on 2017/12/5.
 */
public class TestQuery {
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

//       List objects= (List) session.createQuery("select stu.id,stu.name from Student stu").list();
      /*  List Stus=session.createQuery("from Student").list();
        Student stu= (Student) session.get(Student.class,7);
        System.out.println(stu);
        List Stus1=session.createQuery("from Student").list();*/



   /*     Student stu= (Student) session.get(Student.class, 7);
        System.out.println(stu.getAdress());
        \
        */


      /* Query q= session.createQuery("from Student");
        Iterator<Student> it= q.iterate();
        while (it.hasNext())
        {
            System.out.println("iterate语句测试query cache:" + it.next());
        }
        Query q1= session.createQuery("from Student");
        Iterator<Student> it1= q1.iterate();
        while (it1.hasNext())
        {
            System.out.println("iterate语句测试query cache:" + it1.next());
        }*/

      /* session.createQuery("from Student").list();*/
        Student stu= (Student) session.get(Student.class,7);
        // 提交事务
      tx.commit();
        // 关闭

        session.close();
        sf.close();

}}

