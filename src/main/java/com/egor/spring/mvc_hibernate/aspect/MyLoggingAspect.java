package com.egor.spring.mvc_hibernate.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    @Around("execution(* com.egor.spring.mvc_hibernate.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        String methodName = methodSignature.getName();

        System.out.println("Начал работу " + methodName);

        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("Закончил работу " + methodName);

        return targetMethodResult;
    }

}
