package com.AOP.logs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOP_Logs {
	
	String expression = "execution(public String com.spring.service.impl.OwnerServiceImpl.findOwner())";
//	we can't use the variables directly when we are working with the Annotations
//	so
	
	@Pointcut("execution(public String com.spring.service.impl.OwnerServiceImpl.findOwner())")
	public void ownerExpression() {	
	}
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AOP_Logs.class);
	
//	@Before("ownerExpression()")
//	public void beforeLogAdvice(JoinPoint joinPoint) {
//		LOGGER.info("Entered " + joinPoint.getSignature() + " with the args "+joinPoint.getArgs());
//	}
	
	@After("ownerExpression()")
	public void afterLogAdvice(JoinPoint joinPoint) {
		LOGGER.info("Exiting " + joinPoint.getSignature());
	}
	
//	@AfterReturning(pointcut = "ownerExpression()", returning = "result")
//	public void afterReturningLogAdvice(JoinPoint joinPoint, String result) {	// String is the return type of the method if it is not sure we can Object
//		System.out.println("After Returning................");
//		LOGGER.info("Exiting " + joinPoint.getSignature(), result);
//	}
//	
//	@AfterThrowing(pointcut = "ownerExpression()", throwing = "e")
//	public void afterThrowingLogAdvice(JoinPoint joinPoint, Exception e) {	// String is the return type of the method if it is not sure we can Object
//		System.out.println("After Throwing................");
//		LOGGER.error("Exiting " + joinPoint.getSignature(), e.getMessage());
//	}
	
//	@Around("ownerExpression()")
//	public Object aroundLogAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//		System.out.println("Before Around................");
//		LOGGER.info("Entered " + proceedingJoinPoint.getSignature());
//		Object obj = proceedingJoinPoint.proceed();
//		LOGGER.info("Exiting " + proceedingJoinPoint.getSignature());
//		System.out.println("After Around................");
//		return obj;
//	}
}
