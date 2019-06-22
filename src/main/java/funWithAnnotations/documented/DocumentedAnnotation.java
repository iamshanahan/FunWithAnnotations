package funWithAnnotations.documented;

import java.lang.annotation.Documented;

/**
 * This annotation shows how the @Documented annotation works, namely, that it
 * is referenced in the javadoc of classes that invoke it. Examine javadoc to
 * see.
 * 
 * @author bshanahan
 *
 */
@Documented
public @interface DocumentedAnnotation {
	String value();

	int intMember() default 17;
}
