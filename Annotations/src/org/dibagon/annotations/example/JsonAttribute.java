package org.dibagon.annotations.example;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAttribute {
    String key() default "";
    boolean capitalize() default false;
}