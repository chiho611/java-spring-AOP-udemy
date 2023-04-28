package com.in28minutes.learnspringaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    //execution (* com.in28minutes.learnspringaop.business.*.*(..))
    @Before("com.in28minutes.learnspringaop.aspects.CommonPointCutConfig.allPackageConfigUsingBean()")
    public void logMethodCallBefore(JoinPoint joinPoint) {
        logger.info("Before Aspect - {} is called with arguments - {}", joinPoint, joinPoint.getArgs());
    }

    @After("com.in28minutes.learnspringaop.aspects.CommonPointCutConfig.allPackageConfig()")
    public void logMethodCallAfter(JoinPoint joinPoint) {
        logger.info("After Aspect - {} is called with arguments - {}", joinPoint, joinPoint.getArgs());
    }

    @AfterThrowing(
            pointcut = "com.in28minutes.learnspringaop.aspects.CommonPointCutConfig.allPackageConfig()",
            throwing = "exception"
    )
    public void logMethodCallAfterThrowing(JoinPoint joinPoint,Exception exception) {
        logger.info("AfterThrowing Aspect - {} is throwing exception - {}", joinPoint, exception.getMessage());
    }

    @AfterReturning(
            pointcut = "com.in28minutes.learnspringaop.aspects.CommonPointCutConfig.allPackageConfig()",
            returning = "resultValue"
    )
    public void logMethodCallAfterReturning(JoinPoint joinPoint,Object resultValue) {
        logger.info("AfterReturning Aspect - {} has return - {}", joinPoint, resultValue);
    }

}
