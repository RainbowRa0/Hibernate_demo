package test;
/**
 *@auth ������
 *@time 2019��5��2������4:51:22
 */


import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import entity.Grade;
import entity.Student;

public class one_to_many {
	@Test
	public void fun(){
		//1 ����,���ÿղι���
		Configuration conf = new Configuration().configure();
		//2 ����������Ϣ,���� SessionFactory����
		SessionFactory sf = conf.buildSessionFactory();
		//3 ���session
		Session session = sf.openSession();
		//4 session��ò��������Transaction����	
		//�������񲢻�ò��������tx����(����ʹ��)
		Transaction tx2 = session.beginTransaction();
		//----------------------------------------------
		/*
		Grade c=new Grade((long)2,"���1��");
		Student s1=new Student((long)8,"������","Ů");
		Student s2=new Student((long)9,"ʯ��","��");
		//���ϣ����ѧ��������Ӷ�Ӧ�İ༶��ţ���Ҫ�ڰ༶�����ѧ��������������ϵ
		Collections.addAll(c.getStus(), s1,s2);
 
		session.save(c);
		session.save(s1);
		session.save(s2);
        */
		Grade group=(Grade)session.get(Grade.class, (long)1);
		java.util.Set<Student> users = group.getStus();
		Iterator<Student> us=users.iterator();
		while(us.hasNext()){
		    Student user=(Student)us.next();
		    System.out.println(user);
		}
		//----------------------------------------------
		tx2.commit();//�ύ����
		session.close();//�ͷ���Դ
		sf.close();//�ͷ���Դ
	}
}
