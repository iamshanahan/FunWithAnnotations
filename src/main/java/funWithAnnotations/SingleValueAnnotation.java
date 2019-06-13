package funWithAnnotations;

import java.lang.annotation.Inherited;

// @Retention(RetentionPolicy.CLASS) // default
//@Repeatable(value = null)
@Inherited
public @interface SingleValueAnnotation {
	String value() default ("default value");
}
