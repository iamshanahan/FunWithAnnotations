package funWithAnnotations.targeted;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // for unit test access
@Target({ ElementType.PARAMETER })
public @interface ParameterAnnotation {

}
