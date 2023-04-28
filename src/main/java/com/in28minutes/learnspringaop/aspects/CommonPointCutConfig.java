package com.in28minutes.learnspringaop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {
    @Pointcut("execution (* com.in28minutes.learnspringaop.*.*.*(..))")
    public void allPackageConfig() {
    }


    @Pointcut("execution (* com.in28minutes.learnspringaop.business.*.*(..))")
    public void businessPackageConfig() {
    }


    @Pointcut("execution (* com.in28minutes.learnspringaop.data.*.*(..))")
    public void dataPackageConfig() {
    }


    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {
    }


    @Pointcut("@annotation(com.in28minutes.learnspringaop.annotations.TrackTime)")
    public void trackTimeAnnotation() {
    }


}
