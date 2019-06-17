package targeted.classes;

import targeted.ConstructorAnnotation;
import targeted.FieldAnnotation;
import targeted.GenericAnnotation;
import targeted.LocalVarAnnotation;
import targeted.MethodAnnotation;
import targeted.ParameterAnnotation;
import targeted.TypeAnnotation;

/**
 * Demonstrates which types of targeted annotations get accepted by the compiler
 * in different places. Namely: Class, Field, CTOR, param, line of code, method,
 * local var. Uncommenting any annotation results in compile error.
 * 
 * @author bshanahan
 *
 */

// Class
@GenericAnnotation // *always* accepted
//@AnnotationAnnotation // does not compile
//@ConstructorAnnotation // does not compile
//@FieldAnnotation // does not compile
//@LocalVarAnnotation // does not compile
//@MethodAnnotation // does not compile
//@PackageAnnotation // does not compile
//@ParameterAnnotation // does not compile
@TypeAnnotation // *does* compile
public class AnnotatedClass implements AnnotatedInterface {

	// Field
	@GenericAnnotation // *always* accepted
	// @AnnotationAnnotation // does not compile
	// @ConstructorAnnotation // does not compile
	@FieldAnnotation // *does* compile
	// @LocalVarAnnotation // does not compile
	// @MethodAnnotation // does not compile
	// @PackageAnnotation // does not compile
	// @ParameterAnnotation // does not compile
	// @TypeAnnotation // does not compile
	String someField;

	// Constructor
	@GenericAnnotation // *always* accepted
	// @AnnotationAnnotation // does not compile
	@ConstructorAnnotation // *does* compile
	// @FieldAnnotation // does not compile
	// @LocalVarAnnotation // does not compile
	// @MethodAnnotation // does not compile
	// @PackageAnnotation // does not compile
	// @ParameterAnnotation // does not compile
	// @TypeAnnotation // does not compile
	public AnnotatedClass(

			// Parameter
			@GenericAnnotation // *always* accepted
			// @AnnotationAnnotation // does not compile
			// @ConstructorAnnotation // does not compile
			// @FieldAnnotation // does not compile
			// @LocalVarAnnotation // does not compile
			// @MethodAnnotation // does not compile
			// @PackageAnnotation // does not compile
			@ParameterAnnotation // *does* compile
			// @TypeAnnotation // does not compile
			String ctrParam

	) {

		// Line of code. Nothing is accepted here because we're not declaring an object
		// @GenericAnnotation // *always* accepted (well almost). Error slightly
		// different.
		// @AnnotationAnnotation // does not compile
		// @ConstructorAnnotation // does not compile
		// @FieldAnnotation // does not compile
		// @LocalVarAnnotation // does not compile
		// @MethodAnnotation // does not compile
		// @PackageAnnotation // does not compile
		// @ParameterAnnotation // does not compile
		// @TypeAnnotation // does not compile
		someField = ctrParam;
	}

	// Method
	@GenericAnnotation // *always* accepted
	// @AnnotationAnnotation // does not compile
	// @ConstructorAnnotation // does not compile
	// @FieldAnnotation // does not compile
	// @LocalVarAnnotation // does not compile
	@MethodAnnotation // *does* compile
	// @PackageAnnotation // does not compile
	// @ParameterAnnotation // does not compile
	// @TypeAnnotation // does not compile
	public String getOutputString() {

		// Local variable. Dubious usefulness.
		@GenericAnnotation // *always* accepted
		// @AnnotationAnnotation // does not compile
		// @ConstructorAnnotation // does not compile
		// @FieldAnnotation // does not compile
		@LocalVarAnnotation // *does* compile
		// @MethodAnnotation // does not compile
		// @PackageAnnotation // does not compile
		// @ParameterAnnotation // does not compile
		// @TypeAnnotation // does not compile
		String output = "This is my field and constant: " + someField + " , " + someConst;
		return output;
	}

	public static void main(String[] args) {
		System.out.println((new AnnotatedClass("param-to-ctr-from-main")).getOutputString());
	}

}
