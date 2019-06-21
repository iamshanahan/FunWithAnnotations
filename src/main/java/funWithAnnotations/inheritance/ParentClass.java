package funWithAnnotations.inheritance;

/**
 * Demonstrates that the Inherited annotation is multi-level.
 * 
 * @author bshanahan
 *
 */
public class ParentClass extends AnnotatedGrandparentClass {

	@Override
	public int methodsDoNotInherit() {
		return 0;
	}

}
