package targeted;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GenericAnnotation {
	int someInt() default 3;

	String[] someStrings() default { "String 1", "String 2" };
}
