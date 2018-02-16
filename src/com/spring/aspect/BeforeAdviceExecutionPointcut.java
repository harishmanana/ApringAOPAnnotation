package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdviceExecutionPointcut {
	
	@Before("execution(void com.spring.service.UserService.methodSpecific())")
	public void beforeMethodSpecific(JoinPoint jp) {
        System.out.println("\nBefore Specific method calling ....");
    }
	
	@Before("execution(* com.spring.service.UserService.*(int, int, int))")
	public void beforeAnyMethodWithThreeParams(JoinPoint jp) {
        System.out.println("\nAny Method with 3 parameter calling ....");
    }

	@Before("execution(int com.spring.service.UserService.*(*, *))")
	public void beforeMethodWithTwoParamsIntReturn(JoinPoint jp) {
        System.out.println("\nAny Method with 2 parameter and int return calling ....");
    }
	
	@Before("execution(int com.spring.service.UserService.*(int, int))")
	public void beforeMethodWithTwoIntParamsIntReturn(JoinPoint jp) {
        System.out.println("\nAny Method with 2 int parameter and int return calling ....");
    }

	@Before("execution(* com.spring.service.UserService.*(*, *))")
	public void beforeMethodWithTwoParamsAnyReturn(JoinPoint jp) {
        System.out.println("\nAny Method with 2 parameter and any return calling ....");
    }
}
