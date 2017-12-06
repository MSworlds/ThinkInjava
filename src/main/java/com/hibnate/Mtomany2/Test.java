package com.hibnate.Mtomany2;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	/**
	 * @param args
	 */
//部门添加测试
@org.junit.Test
	public  void main() {

		Yuangong dept =new Yuangong();
		dept.setName("张三rx");

		Yuangong dept1 =new Yuangong();
		dept1.setName("李四x");

		Yuangong dept2 =new Yuangong();
		dept2.setName("王五r");


		Bumen bumen=new Bumen();
		bumen.setBumenname("x项目");

		Bumen bumen1=new Bumen();
		bumen1.setBumenname("r人事");
//		bumen.setYuangongs(yuangong);
//		bumen.setBumenname("x项目");
//		bumen1.setYuangongs(yuangong1);
//		bumen1.setBumenname("r人事");


		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
//	添加
//	   session.save(bumen);
//	   session.save(bumen1);


//	   中间表添加
		trans tran=new trans();
		tran.setYuangong(dept1);
		tran.setBumen(bumen1);

		trans tran1=new trans();
		tran1.setYuangong(dept);
		tran1.setBumen(bumen1);

		trans tran2=new trans();
		tran2.setYuangong(dept);
		tran2.setBumen(bumen);

		trans tran3=new trans();
		tran3.setYuangong(dept2);
		tran3.setBumen(bumen);


		session.save(dept);

		session.save(dept1);
		session.save(dept2);

		session.save(bumen);
		session.save(bumen1);

		session.save(tran);
		session.save(tran1);
		session.save(tran2);
		session.save(tran3);
	   
	   
       
		/*session.save(dept);
		session.save(dept1);*/
//	   获取
//	   删除
 /* Bumen bumen111= (Bumen) session.get(Bumen.class, 18);
  session.delete(bumen111);
*/

//	   查找
	/*  System.out.println(session.createQuery("from Dept").list()); */
	/*  Dept dept1= (Dept)session.get(Dept.class, 12);
	  System.out.println(dept1); */
		tr.commit();

		session.close();


	}
	//	员工添加测试
	@org.junit.Test
	public void mangtone(){
		Yuangong dept =new Yuangong();
		dept.setName("aa");
		Yuangong dept1 =new Yuangong();
		dept1.setName("bb");
		Bumen bumen=new Bumen();
		bumen.setBumenname("项目部1");
	    /*dept.setBumen(bumen);
		dept1.setBumen(bumen);*/
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
//	添加
	  /* session.save(bumen);*/
	  /* session.save(dept);
	   session.save(dept1);*/
//	  删除
		Yuangong Yuangong222= (Yuangong) session.get(Yuangong.class, 10);
		session.delete(Yuangong222);


		tr.commit();

		session.close();



	}


}
