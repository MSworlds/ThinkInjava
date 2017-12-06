package com.hibnate.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class Testone2one {
	
	@Test
	public void tt(){
		
	   Person  person =new Person();
	   person.setUsername("mm");
	   
	   
	   Idcade idcade=new Idcade();
	    idcade.setAdress("123");
	    idcade.setIdnum("23323424242342342344");
	    
	    person.setIdcade(idcade);
	    idcade.setPerson(person);
	    
	    
	    Session session =new Configuration().configure().buildSessionFactory().openSession();
	    
	    Transaction tr = session.beginTransaction();
	   

	    session.save(idcade);
		session.save(person);
	    tr.commit();
	    session.close();
	    
	    
	    
	   
		
		
		
	}
	
	
}
