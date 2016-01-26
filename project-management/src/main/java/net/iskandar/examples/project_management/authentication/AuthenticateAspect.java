/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.authentication;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import net.iskandar.examples.project_management.ProjectManagementException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author iskandar
 */
@Component
@Aspect
public class AuthenticateAspect {

    private static final Logger log = LogManager.getLogger(AuthenticateAspect.class);
    private static final ExpressionParser parser = new SpelExpressionParser();
    
    @Autowired
    private Authenticator authenticator;

    @Around("@annotation(net.iskandar.examples.project_management.authentication.Authenticate)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            log.debug("=========================================== around ===================================================================");
            log.debug("target=" + joinPoint.getTarget().getClass().getName());
            log.debug("this=" + joinPoint.getThis().getClass().getName());
            log.debug("method=" + joinPoint.getSignature().getName());
            Signature signature = joinPoint.getSignature();
            log.debug("signature.class.name=" + signature.getClass().getName());
            if (signature instanceof MethodSignature) {
                MethodSignature methodSignature = (MethodSignature) signature;
                Method method = methodSignature.getMethod();
                Authenticate authenticate = method.getAnnotation(Authenticate.class);
                StandardEvaluationContext context = new StandardEvaluationContext();
                context.setRootObject(this);
                Object[] args = joinPoint.getArgs();
                setParameters(context, methodSignature, args);
                Expression expression = parser.parseExpression(authenticate.value());
                boolean allowed = expression.getValue(context, Boolean.class);
                if(allowed)
                    return joinPoint.proceed();
                else throw new ProjectManagementException("User do not have enough privileges");
            } else {
                return joinPoint.proceed();
            }
        } catch(Throwable t){
            t.printStackTrace();
            throw t;
        }
    }

    private static void setParameters(StandardEvaluationContext context, MethodSignature methodSignature, Object[] args) {
        Method method = methodSignature.getMethod();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        String paramName = null;
        Object paramValue = null;
        for (int i = 0; i < parameterAnnotations.length; i++) {
            Annotation[] annotations = parameterAnnotations[i];
            for (Annotation annotation : annotations) {
                if (annotation instanceof Param) {
                    Param param = (Param) annotation;
                    paramName = param.value();
                    paramValue = args[i];
                    context.setVariable(paramName, paramValue);
                }
            }
        }
    }

    public Boolean hasRole(String roleCode) {
        System.out.println("hasRole('" + roleCode + "')");
        return authenticator.hasRole(roleCode);
    }

    public Boolean hasRole(Object object, String roleCode) {
        System.out.println("hasRole(" + object.toString() + ", '" + roleCode + "')");        
        return authenticator.hasRole(object, roleCode);
    }


}
