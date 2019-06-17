package funWithAnnotations;

import targeted.GenericAnnotation;

@SingleValueAnnotation
public class SomeParentClass {

	// @GenericAnnotation
	protected final String field;

	// @GenericAnnotation(someInt = 3)
	public String someLibraryMethod(@GenericAnnotation String parameter) {
		return "parent lib method called with " + parameter;
	}

	public SomeParentClass(String fieldIn) {
		field = fieldIn;
	}
}