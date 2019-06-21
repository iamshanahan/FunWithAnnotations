package funWithAnnotations.inheritance;

@InheritableAnnotation("Set by interface")
public interface AnnotatedInterface {

	@InheritableAnnotation
	int methodsDoNotInherit();
}
