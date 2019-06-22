package funWithAnnotations.repeating;

import java.lang.annotation.Repeatable;

@Repeatable(RepeatingAnnotationContainer.class)
public @interface RepeatingAnnotation {
	String name();

	int instance();
}
