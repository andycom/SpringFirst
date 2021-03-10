package com.fancv.scan;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class MyCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return true;
    }
}