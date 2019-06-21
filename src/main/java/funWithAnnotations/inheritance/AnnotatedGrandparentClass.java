package funWithAnnotations.inheritance;

/**
 * Only exists to demonstrate that annotation inheritance is multi-level
 * 
 * @author bshanahan
 *
 */
@InheritableAnnotation("Set by grandparent")
public abstract class AnnotatedGrandparentClass {

	public abstract int methodsDoNotInherit();
}
