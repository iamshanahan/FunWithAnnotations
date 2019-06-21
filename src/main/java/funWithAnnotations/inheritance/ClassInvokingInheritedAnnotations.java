package funWithAnnotations.inheritance;

public class ClassInvokingInheritedAnnotations {

	public static class AnnotationsDoNotInheritFromInterface implements AnnotatedInterface {

		@Override
		public int methodsDoNotInherit() {
			return 0;
		}

	}

	public static class InheritsAnnotationFromSuperclass extends ParentClass {

		@Override
		public int methodsDoNotInherit() {
			return 1;
		}
	}

	@InheritableAnnotation
	public static class ResetsAnnotationToDefault extends AnnotatedGrandparentClass {

		@Override
		public int methodsDoNotInherit() {
			return 1;
		}
	}

	@InheritableAnnotation("set by child class")
	public static class OverridesInheritedAnnotation extends AnnotatedGrandparentClass {

		@Override
		public int methodsDoNotInherit() {
			return 1;
		}
	}
}
