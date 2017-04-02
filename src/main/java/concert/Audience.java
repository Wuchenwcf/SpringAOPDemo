package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	
	@Pointcut("execution(** concert.Performance.perform(..))") //此处**之后要加空格，否则会报错
	public void performance()
	{
	}

	@Before("performance()")//表演之前
	public void silenceCellPhones()
	{
		System.out.println("Silence Cell phones");
	}
	
	@Before("performance()")//表演之前
	public void takeSeats()
	{
		System.out.println("Taking seats");
	}
	
	@AfterReturning("performance()")//表演之后
	public void applause()
	{
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")//表演失败之后
	public void demandRefund()
	{
		System.out.println("Demanding a refund");
	}
	
	
}
