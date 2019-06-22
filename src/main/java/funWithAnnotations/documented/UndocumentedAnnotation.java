package funWithAnnotations.documented;

/**
 * This annotation demonstrates how annotations without @Documented work.
 * Namely, they can show up in javadoc (if selected for javadoc generation), but
 * they will not show up in the javadoc for the classes that invoke them.
 * 
 * @author bshanahan
 *
 */
public @interface UndocumentedAnnotation {
	String value();

	int intMember() default 18;
}
