package test;
/**
 *@auth 饶婷婷
 *@time 2019年5月2日下午4:51:22
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
		//1 创建,调用空参构造
		Configuration conf = new Configuration().configure();
		//2 根据配置信息,创建 SessionFactory对象
		SessionFactory sf = conf.buildSessionFactory();
		//3 获得session
		Session session = sf.openSession();
		//4 session获得操作事务的Transaction对象	
		//开启事务并获得操作事务的tx对象(建议使用)
		Transaction tx2 = session.beginTransaction();
		//----------------------------------------------
		/*
		Grade c=new Grade((long)2,"软件1班");
		Student s1=new Student((long)8,"饶婷婷","女");
		Student s2=new Student((long)9,"石向东","男");
		//如果希望在学生表中添加对应的班级编号，需要在班级中添加学生，建立关联关系
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
		tx2.commit();//提交事务
		session.close();//释放资源
		sf.close();//释放资源
	}
}
