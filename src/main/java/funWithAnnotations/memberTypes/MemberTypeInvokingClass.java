package funWithAnnotations.memberTypes;

/**
 * Demonstrates the invocation syntax for all possible annotation types.  Unit test not productive.
 * @author bshanahan
 *
 */
public class MemberTypeInvokingClass {
	
	@AnnotationExhaustingMemberTypes(
		booleanMember = true,
		charMember = 'a',
		doubleMember = 17.2F,
		stringMember = "kite",
		enumMember = InnerEnum.ANN,
		annotationMember = @InnerAnnotation( "sisal" ),
		
		booleanArrayMember = { true, false },
		charArrayMember = { '\t', '\n' },
		doubleArrayMember = { 0.0000001, Double.MAX_VALUE, Double.MIN_VALUE },
		stringArrayMember = { "latch", "baking" },
		enumArrayMember = { InnerEnum.NANCY },
		annotationArrayMember =
			{ @InnerAnnotation( "silly" ), @InnerAnnotation( "theory, " ) }
	)
	static int fullyAnnotedField;

	@AnnotationExhaustingMemberTypes(
		booleanMember = true,
		charMember = 'a',
		doubleMember = 17.2F,
		stringMember = "kite",
		enumMember = InnerEnum.NANCY,
		annotationMember = @InnerAnnotation( "sisal" ),
		
		booleanArrayMember = {},
		charArrayMember = {},
		doubleArrayMember = {},
		stringArrayMember = {},
		enumArrayMember = {},
		annotationArrayMember = {}
	)
	static int emptyArraysWorkToo;
}
