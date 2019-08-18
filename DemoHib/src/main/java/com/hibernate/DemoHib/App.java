package com.hibernate.DemoHib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        Student Stud=new Student();
       
        Stud.setId(1111);
        Stud.setName("Akassss");	
        Stud.setSirname("Kassssma");
        
       Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
       
       //ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       
       SessionFactory sf=con.buildSessionFactory();
       Session session=sf.openSession();
       
       Transaction tx=session.beginTransaction();
       
       session.save(Stud);
       
       tx.commit();
       
       
    }
    
}
