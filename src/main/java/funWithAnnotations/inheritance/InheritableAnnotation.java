package funWithAnnotations.inheritance;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // for unit test access
@Inherited
public @interface InheritableAnnotation {
	String value() default "String default value";
}
