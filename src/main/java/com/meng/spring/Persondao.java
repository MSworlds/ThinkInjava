package com.meng.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by Administrator on 2017-12-03.
 */
public class Persondao {
//    创建Student对象
//    传统方法创建
public static  void  creatPerson(){
    Resource re =new ClassPathResource("Spring/applicationContext.xml");
    BeanFactory beanfaction=new XmlBeanFactory(re);
    Person p=(Person)beanfaction.getBean("person");
    System.out.println(p);
}
    public static  void  creatPerson1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        Person p=(Person)ac.getBean("person1");
        System.out.println(p);
    }
    public static  void  creatPerson2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        Person p=(Person)ac.getBean("person2");
        System.out.println(p);
    }
    public static  void  creatPerson3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        Person p=(Person)ac.getBean("person3");
        System.out.println(p);
    }
    public static  void  creatPerson4(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
        Person p=(Person)ac.getBean("person4");
        System.out.println(p);
    }
    public static void main(String[] args) {
//        creatPerson();
//        creatPerson1();
//        creatPerson2();
//        creatPerson3();
        creatPerson4();

    }
}

