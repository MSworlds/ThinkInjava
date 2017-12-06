package com.hibnate.test;

import com.hibnate.vo.Student;
import com.hibnate.vo.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2017/12/6.
 */
public class TestMangtoone {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();  // 默认加载src/hibenrate.cfg.xml文件
        // 创建session的工厂对象
        SessionFactory sf = config.buildSessionFactory();
        // 创建session (代表一个会话，与数据库连接的会话)
        Session session = sf.openSession();
        // 开启事务
        Transaction tx = session.beginTransaction();
        //保存-数据库

        Student stu=new Student();
        stu.setSex(1);
        stu.setName("nihao");
        Teacher teacher=new Teacher();
        teacher.setName("laoshji");
        teacher.setSubject("数学");
        stu.setTeacher(teacher);
        session.save(teacher);
        session.save(stu);





        // 提交事务
        tx.commit();
        // 关闭
        session.close();
        sf.close();
    }
}
