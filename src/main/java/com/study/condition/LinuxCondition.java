package com.study.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @author xueshiqi
 * @since 2020/1/9
 * 继承condition来判断系统是否是Linux系统
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return Objects.requireNonNull(conditionContext.getEnvironment().getProperty("os.name")).contains("Linux");
    }
}
