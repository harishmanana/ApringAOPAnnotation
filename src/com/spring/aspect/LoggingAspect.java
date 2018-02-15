package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@After("execution(* com.spring.service.*.*(..))")
	public void afterAdviceForAllMethods(JoinPoint jp) throws Throwable {
        System.out.println("****LoggingAspect.afterAdviceForAllMethods() " + jp.getSignature().getName());
    }
	
	@After("execution(* com.spring.service.*.transfer(*,*,*))")
	public void afterAdviceForTransferMethods(JoinPoint jp) throws Throwable {
        System.out.println("______LoggingAspect.afterAdviceForTransferMethods() " + jp.getSignature().getName());
    }
}
