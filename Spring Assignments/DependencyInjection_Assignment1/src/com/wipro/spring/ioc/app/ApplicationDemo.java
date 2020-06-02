package com.wipro.spring.ioc.app;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.wipro.spring.ioc.models.Student;

	public class ApplicationDemo {
		
		public static void main(String args[]) {
			
			ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			Student student1=(Student)appContext.getBean("student1");
			Student student2= (Student)appContext.getBean("student2");
			student1.display();
			System.out.println("--------------------------------------------------------");
			student2.display();
			
		}
}
