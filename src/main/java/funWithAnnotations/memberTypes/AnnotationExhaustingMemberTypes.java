package funWithAnnotations.memberTypes;

public @interface AnnotationExhaustingMemberTypes {
	// singles
	boolean booleanMember();

	char charMember();

	double doubleMember();

	// pointless to do them all primitives
	String stringMember();

	InnerEnum enumMember();

	InnerAnnotation annotationMember();

	Class<?> classmember();

	// arrays
	boolean[] booleanArrayMember();

	char[] charArrayMember();

	double[] doubleArrayMember();

	String[] stringArrayMember();

	InnerEnum[] enumArrayMember();

	InnerAnnotation[] annotationArrayMember();

	Class<?>[] classArrayMember();

}
