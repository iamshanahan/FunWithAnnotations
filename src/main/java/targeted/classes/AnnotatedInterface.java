package targeted.classes;

import targeted.FieldAnnotation;
import targeted.GenericAnnotation;
import targeted.MethodAnnotation;
import targeted.TypeAnnotation;

/**
 * Interface whose purpose is to demonstrate where differently targeted
 * annotations apply.
 * 
 * @author bshanahan
 *
 */

//Interface declaration.
@GenericAnnotation // *always* accepted
//@AnnotationAnnotation // does not compile
//@ConstructorAnnotation // does not compile
//@FieldAnnotation // does not compile
//@LocalVarAnnotation // does not compile
//@MethodAnnotation // does not compile
//@PackageAnnotation // does not compile
//@ParameterAnnotation // does not compile
@TypeAnnotation // *does* compile
public interface AnnotatedInterface {

	// Static Field / Constant. Even in interfaces.
	@GenericAnnotation // *always* accepted
	// @AnnotationAnnotation // does not compile
	// @ConstructorAnnotation // does not compile
	@FieldAnnotation // *does* compile
	// @LocalVarAnnotation // does not compile
	// @MethodAnnotation // does not compile
	// @PackageAnnotation // does not compile
	// @ParameterAnnotation // does not compile
	// @TypeAnnotation // does not compile
	static final String someConst = "Constant Value";

	// Abstract method. Interesting that this is annotate-able. Will check inherit
	// behavior.
	@GenericAnnotation // *always* accepted
	// @AnnotationAnnotation // does not compile
	// @ConstructorAnnotation // does not compile
	// @FieldAnnotation // does not compile
	// @LocalVarAnnotation // does not compile
	@MethodAnnotation // *does* compile
	// @PackageAnnotation // does not compile
	// @ParameterAnnotation // does not compile
	// @TypeAnnotation // does not compile
	String getOutputString();
}
