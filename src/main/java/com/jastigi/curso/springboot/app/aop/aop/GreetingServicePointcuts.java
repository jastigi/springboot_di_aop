package com.jastigi.curso.springboot.app.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePointcuts {

    @Pointcut("execution(* com.jastigi.curso.springboot.app.aop.services.GreetingService.*(..))")
    public void greetingLoggerPointcut() {
    }

    @Pointcut("execution(* com.jastigi.curso.springboot.app.aop.services.GreetingService.*(..))")
    public void greetingFooLoggerPointcut() {

    }

}
