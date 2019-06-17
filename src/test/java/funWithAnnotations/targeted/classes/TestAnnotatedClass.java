package funWithAnnotations.targeted.classes;

import static org.junit.Assert.assertTrue;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import targeted.GenericAnnotation;
import targeted.PackageAnnotation;
import targeted.TypeAnnotation;
import targeted.classes.AnnotatedClass;

public class TestAnnotatedClass {

	@SafeVarargs
	private static void assertAnnotationsExpected(Annotation[] observedAnnots,
			Class<? extends Annotation>... expectedAnnotClasses) {
		List<Class<? extends Annotation>> expectedAnnotClassList = new ArrayList<>(Arrays.asList(expectedAnnotClasses));
		for (Annotation observedAnnot : observedAnnots) {
			assertTrue(expectedAnnotClassList.contains(observedAnnot.annotationType()));
			expectedAnnotClassList.remove(observedAnnot.annotationType());
		}
		assertTrue(expectedAnnotClassList.isEmpty());
	}

	@Test
	public void testClassAnnotation() {
		AnnotatedClass acInstance = new AnnotatedClass("test-ctr-param");

		Class<? extends AnnotatedClass> acInstanceClass = acInstance.getClass();

		assertAnnotationsExpected(acInstanceClass.getAnnotations(),
				GenericAnnotation.class, TypeAnnotation.class);

		assertAnnotationsExpected(acInstanceClass.getPackage().getAnnotations(),
				GenericAnnotation.class, PackageAnnotation.class);

	}

}
