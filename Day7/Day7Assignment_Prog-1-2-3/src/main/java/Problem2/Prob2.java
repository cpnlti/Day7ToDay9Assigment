package Problem2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//#2. In a Spring application which uses @ComponentScan, print the details of all Beans recognized by Spring Container.

class Company{
	
}
class Employee{
	
}
class Address{
	
}

@Configuration
class OwnConfig{
	@Bean 
	@Scope("prototype")
	public Company companybean(String name,String city,String email){
		return new Company();
	}
	@Bean 
	@Scope("prototype")
	public Employee employeebean(){
		System.out.println("public Employee getEBean()");
		return new Employee();
	}	
	
	
	@Bean 
	@Scope("prototype")
	public Address countrybean(String city,double pincode,String Country){
		return new Address();
	}
	
}
@ComponentScan
public class Prob2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(OwnConfig.class);
		String[] bean_names = ctx.getBeanDefinitionNames();
        for(String bean_name: bean_names)
        {
            System.out.println(bean_name);
            System.out.println("***------*****");
        }
	}
}
