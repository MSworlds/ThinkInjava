package com.hibnate.test;

import com.hibnate.vo.Grade;
import com.hibnate.vo.Student;
import com.hibnate.vo.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/12/6.
 */
public class TestMangtoMany {
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

        Grade grade=new Grade();
        grade.setName("12");
        Teacher teacher=new Teacher();
        teacher.setName("nv");
        Teacher teacher1=new Teacher();
        teacher.setName("nv1");
        Set<Teacher> teachers=new HashSet<Teacher>();
        teachers.add(teacher);teachers.add(teacher1);
        grade.setTeacher(teachers);
        session.save(teacher);
        session.save(teacher1);
        session.save(grade);





        // 提交事务
        tx.commit();
        // 关闭
        session.close();
        sf.close();
    }
}
