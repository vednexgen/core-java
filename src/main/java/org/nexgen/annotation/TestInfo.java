package org.nexgen.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {
    String author();
    int priority() default 1;
}
