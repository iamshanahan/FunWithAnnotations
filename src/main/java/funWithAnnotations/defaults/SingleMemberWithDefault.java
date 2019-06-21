package funWithAnnotations.defaults;

public @interface SingleMemberWithDefault {
	String value() default "default-value";
}
