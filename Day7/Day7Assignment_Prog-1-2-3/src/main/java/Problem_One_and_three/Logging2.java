package Problem_One_and_three;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging2 {
	//@Before("execution(* *.set*(int))")
	@Before("execution(* *.*(..))")
	public void adv()
	{
		System.out.println("before loggingggggggggggggg22222");
	}
	//@Before("execution(* *.*(..))")
	@Before("execution(* *.*(int))")
	public void adv3()
	{
		System.out.println("before loggingggggggg222..................");
	}
	
	//AfterThrow
	//@After("execution(* *.*(int))")
	@After("execution(* *.*(..))")
	
	public void adv1()
	{
		System.out.println("after logginggggggg222222");
	}
}
/*@Aspect
class Logging2 {
	@Before("execution(* *.set*(int))")
	public void adv()
	{
		System.out.println("before logging");
	}
	@Before("execution(* *.set*(int))")
	public void adv3()
	{
		System.out.println("before logging");
	}
	
	//AfterThrow
	@After("execution(* *.*(int))")
	public void adv1()
	{
		System.out.println("after logging");
	}
}*/