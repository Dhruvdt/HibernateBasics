package com.dhruvdt.hibernate.processing;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.dhruvdt.hibernate.College;
import com.dhruvdt.hibernate.Student;
import com.dhruvdt.hibernate.util.HibernateUtil;

public class AppMain {
	public static void main(String[] args) {
		
		  Student student = new Student("Ramesh", "Fadatare",
		  "rameshfadatare@javaguides.com",1, new Date());
		  Student student1 = new Student("John",
		  "Cena", "john@javaguides.com",2,new Date());
		  Student student3 = new Student("John2",
		  "Cena2", "john2@javaguides.com",3 ,new Date());
		  
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
       
		session.save(student);
		session.save(student3);
		session.getTransaction().commit();
		 
		
		Query q = session.createQuery("From Student ");
        
        List<Student> resultList = q.list();
        System.out.println("num of Student:" + resultList.size());
        for (Student next : resultList) {
            System.out.println("next Student: " + next);
        }
        
    }
}