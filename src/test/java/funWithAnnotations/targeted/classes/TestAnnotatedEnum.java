package funWithAnnotations.targeted.classes;

import static funWithAnnotations.Helpers.assertAnnotationsExpected;

import org.junit.Test;

import funWithAnnotations.targeted.GenericAnnotation;
import funWithAnnotations.targeted.PackageAnnotation;
import funWithAnnotations.targeted.TypeAnnotation;
import funWithAnnotations.targeted.classes.AnnotatedEnum;

public class TestAnnotatedEnum {

	@Test
	public void testClassAnnotation() {

		Class<? extends AnnotatedEnum> cs = AnnotatedEnum.class;
		assertAnnotationsExpected(cs.getAnnotations(),
				TypeAnnotation.class,
				GenericAnnotation.class);
		assertAnnotationsExpected(cs.getPackage().getAnnotations(),
				PackageAnnotation.class,
				GenericAnnotation.class);
	}

}
