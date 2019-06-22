package funWithAnnotations.override;

public class ClassInvokingOverride extends SomeAbstractClass implements SomeInterface {

	@Override
	public int overrideMayBeUsedWhenImplementingInterface() {
		return 0;
	}

	@Override
	public int overrideMayBeUsedWhenExtendingClass() {
		return 0;
	}

	public int butIsNotRequired() {
		return 0;
	}

	// @Override // does not compile
	public int overrideCannotBeUsedOnNonInheritedMethods() {
		return 0;
	}

	// @Override // does not compile
	public int overrideCannotBeUsedElsewhere;
}
