package Problem_One_and_three;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) throws Exception {
		//Load configuration from XML
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("F:\\eclipse-workspace\\ASpringAOPMaven_17\\src\\main\\java\\Beans.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		//retrieve Bean from Spring
		Employee emp = (Employee) ctx.getBean("e");
		System.out.println("----------Before----------");
		//invoke methods
		emp.getId();
		System.out.println("----------After----------");
		
		 /* Printing Beans */
		 String[] bean_names = ctx.getBeanDefinitionNames();
		 for(String bean_name: bean_names) {
			 System.out.println(bean_name);
		 }
		  
		System.out.println();
		emp.getName();
		System.out.println("---------------------");
		emp.setId(10);
		System.out.println("---------------------"); 
		System.out.println();
		emp.setName("jdsg");
		emp.getSalary();
	}
}
