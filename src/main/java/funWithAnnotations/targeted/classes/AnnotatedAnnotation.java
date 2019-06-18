package funWithAnnotations.targeted.classes;

import funWithAnnotations.targeted.AnnotationAnnotation;
import funWithAnnotations.targeted.GenericAnnotation;
import funWithAnnotations.targeted.TypeAnnotation;

/**
 * Annotation that demonstrates what annotations can be applied to annotations
 * 
 * @author bshanahan
 *
 */
@GenericAnnotation // *always* accepted
@AnnotationAnnotation // *does* compile
//@ConstructorAnnotation // does not compile
//@FieldAnnotation // does not compile
//@LocalVarAnnotation // does not compile
//@MethodAnnotation // does not compile
//@PackageAnnotation // does not compile
//@ParameterAnnotation // does not compile
@TypeAnnotation // *does* compile
public @interface AnnotatedAnnotation {

}
