package org.nexgen.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Info {
    String author();
    int priority() default 1;
}