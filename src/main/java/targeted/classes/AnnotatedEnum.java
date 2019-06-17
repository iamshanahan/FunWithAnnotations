package targeted.classes;

import targeted.GenericAnnotation;
import targeted.TypeAnnotation;

/**
 * enum that demonstrates what annotations can be applied to enums.
 * 
 * @author bshanahan
 *
 */
@GenericAnnotation // *always* accepted
//@AnnotationAnnotation // does not compile
//@ConstructorAnnotation // does not compile
//@FieldAnnotation // does not compile
//@LocalVarAnnotation // does not compile
//@MethodAnnotation // does not compile
//@PackageAnnotation // does not compile
//@ParameterAnnotation // does not compile
@TypeAnnotation // *does* compile
public enum AnnotatedEnum {
	PAUL, DAVE, ADAM, LARRY
}
