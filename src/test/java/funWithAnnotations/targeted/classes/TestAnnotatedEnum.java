package funWithAnnotations.targeted.classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.annotation.Annotation;

import org.junit.Test;

import targeted.PackageAnnotation;
import targeted.TypeAnnotation;
import targeted.classes.AnnotatedEnum;

public class TestAnnotatedEnum {

	@Test
	public void testClassAnnotation() {

		Class<? extends AnnotatedEnum> cs = AnnotatedEnum.class;
		Annotation[] classAnnots = cs.getAnnotations();
		assertEquals("", 1, classAnnots.length);
		assertTrue(classAnnots[0] instanceof TypeAnnotation);

		Annotation[] packageAnnots = cs.getPackage().getAnnotations();
		assertEquals("", 1, packageAnnots.length);
		assertTrue(packageAnnots[0] instanceof PackageAnnotation);
	}

}
