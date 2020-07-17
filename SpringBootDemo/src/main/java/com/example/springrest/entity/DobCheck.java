package com.example.springrest.entity;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
 import java.util.Date;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.springframework.boot.context.properties.ConstructorBinding;

@Documented
@Constraint(validatedBy = DobValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface DobCheck {
 String message() default "{Dob not valid}";
	
	
	Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
