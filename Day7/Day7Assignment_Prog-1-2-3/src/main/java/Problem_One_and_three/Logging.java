package Problem_One_and_three;
//#1. Make necessary changes to check if we can have multiple @Before advices in Aspect class

//#3. Create Afterthrow advice in a Logging Aspect, in this Afterthrow advice, print return value.


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	//@Before("execution(* *.set*(int))")
	@Before("execution(* *.*(..))")//.. any number of parameter
	public void adv(JoinPoint jp)
	{
		//System.out.println("before loggingggggggggggggg111111" + " Jointpoint " + " \t "+ jp.getSignature().getName() + " \t "+jp.getTarget().getClass().getName());
		System.out.print("before loggingggggggggggggg111111" + " Jointpoint " + " \t "+ jp.getSignature().getName());
		
		// print the arguments
		Object[] args= jp.getArgs();
		for(Object obj: args) {
			System.out.println(obj+")");
		}
		
		
	}
	//@Before("execution(* *.*(..))")
	@Before("execution(* *.*(int))")
	public void adv3()
	{
		System.out.println("before loggingggggggg11111..................");
	}
	
	//AfterThrow
	//@After("execution(* *.*(int))")
	@After("execution(* *.*(..))")
	
	public void adv1()
	{
		System.out.println("after logginggggggg11111......");
	}
	//AfterReturning
	@AfterReturning(pointcut = "execution(* *.get*(..))", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		if (retVal != null) {
			System.out.println("Returninggggggggggggggg:" + retVal.toString());
		}
	}
	
	//AfterThrowing
	@AfterThrowing(value= "execution(* *.get*(..))", throwing= "exception")
	public void afterThrowingAdv(JoinPoint jp, Throwable exception) {
		System.out.println("Inside afterThrowingAdv() advice= " + jp.getSignature().getName() + " method");
		System.out.println("Exception = " + exception);
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