package funWithAnnotations.inheritance;

import static funWithAnnotations.Helpers.assertAnnotationsExpected;
import static org.junit.Assert.assertEquals;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;

import funWithAnnotations.inheritance.ClassInvokingInheritedAnnotations.AnnotationsDoNotInheritFromInterface;
import funWithAnnotations.inheritance.ClassInvokingInheritedAnnotations.InheritsAnnotationFromSuperclass;
import funWithAnnotations.inheritance.ClassInvokingInheritedAnnotations.OverridesInheritedAnnotation;
import funWithAnnotations.inheritance.ClassInvokingInheritedAnnotations.ResetsAnnotationToDefault;

public class TestClassInvokingInheritedAnnotations {

	@Test
	public void testMethodsDoNotInheritAnnotations() throws NoSuchMethodException, SecurityException {
		InheritsAnnotationFromSuperclass testclass = new InheritsAnnotationFromSuperclass();
		Method mth = testclass.getClass().getMethod("methodsDoNotInherit");

		assertAnnotationsExpected(mth.getAnnotations() /* none */ );
	}

	@Test
	public void testAnnotationsNotInheritedFromInterface() throws NoSuchMethodException, SecurityException {
		AnnotationsDoNotInheritFromInterface testclass = new AnnotationsDoNotInheritFromInterface();
		Annotation[] annotations = testclass.getClass().getAnnotations();
		assertAnnotationsExpected(annotations /* none */ );

	}

	@Test
	public void testAnnotationsInheritedFromSuperclass() throws NoSuchMethodException, SecurityException {
		InheritsAnnotationFromSuperclass testclass = new InheritsAnnotationFromSuperclass();
		assertAnnotationsExpected(testclass.getClass().getAnnotations(),
				InheritableAnnotation.class);
		InheritableAnnotation ia = testclass.getClass().getAnnotation(InheritableAnnotation.class);
		assertEquals("Set by grandparent", ia.value());

	}

	@Test
	public void testSubclassCanResetAnnotation() throws NoSuchMethodException, SecurityException {
		ResetsAnnotationToDefault testclass = new ResetsAnnotationToDefault();
		assertAnnotationsExpected(testclass.getClass().getAnnotations(),
				InheritableAnnotation.class);
		InheritableAnnotation ia = testclass.getClass().getAnnotation(InheritableAnnotation.class);
		assertEquals("String default value", ia.value());

	}

	@Test
	public void testSubclassCanOverrideAnnotation() throws NoSuchMethodException, SecurityException {
		OverridesInheritedAnnotation testclass = new OverridesInheritedAnnotation();
		assertAnnotationsExpected(testclass.getClass().getAnnotations(),
				InheritableAnnotation.class);
		InheritableAnnotation ia = testclass.getClass().getAnnotation(InheritableAnnotation.class);
		assertEquals("set by child class", ia.value());

	}
}
