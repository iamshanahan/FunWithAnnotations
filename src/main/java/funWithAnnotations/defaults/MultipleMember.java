package funWithAnnotations.defaults;

public @interface MultipleMember {
	String value();

	int somethingElse() default 3;
}
