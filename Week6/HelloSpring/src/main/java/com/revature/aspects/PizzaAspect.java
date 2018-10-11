package com.revature.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PizzaAspect {
	
	//Hook - empty method, we can leverage to reuse an annotation
	@Pointcut("execution(* *.eatPizza(..))")
	public void eatPizzaPointcut(){}
	
	@Before(value="eatPizzaPointcut()")
	public void beforeEating(){
		System.out.println("washing hands");
	}
	
	@After(value="eatPizzaPointcut()")
	public void afterEating(){
		System.out.println("washing hands");
	}

}
