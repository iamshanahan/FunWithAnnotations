package funWithAnnotations.targeted.classes;

import static funWithAnnotations.Helpers.assertAnnotationsExpected;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.junit.Test;

import funWithAnnotations.targeted.ConstructorAnnotation;
import funWithAnnotations.targeted.FieldAnnotation;
import funWithAnnotations.targeted.GenericAnnotation;
import funWithAnnotations.targeted.MethodAnnotation;
import funWithAnnotations.targeted.PackageAnnotation;
import funWithAnnotations.targeted.ParameterAnnotation;
import funWithAnnotations.targeted.TypeAnnotation;
import funWithAnnotations.targeted.classes.AnnotatedClass;

public class TestAnnotatedClass {

	@Test
	public void testClassAnnotation() throws NoSuchMethodException, SecurityException {
		AnnotatedClass acInstance = new AnnotatedClass("test-ctr-param");

		Class<? extends AnnotatedClass> acInstanceClass = acInstance.getClass();

		assertAnnotationsExpected(acInstanceClass.getAnnotations(),
				GenericAnnotation.class, TypeAnnotation.class);

		assertAnnotationsExpected(acInstanceClass.getPackage().getAnnotations(),
				GenericAnnotation.class, PackageAnnotation.class);

		Field fields[] = acInstanceClass.getFields();
		assertEquals(1, fields.length);
		assertAnnotationsExpected(fields[0].getAnnotations(),
				FieldAnnotation.class,
				GenericAnnotation.class);

		Constructor<?> ctors[] = acInstanceClass.getConstructors();
		assertEquals(1, ctors.length);
		Constructor<?> ctor = ctors[0];
		assertAnnotationsExpected(ctor.getAnnotations(),
				ConstructorAnnotation.class,
				GenericAnnotation.class);

		Parameter params[] = ctor.getParameters();
		assertEquals(1, params.length);
		assertAnnotationsExpected(params[0].getAnnotations(),
				GenericAnnotation.class,
				ParameterAnnotation.class);

		Method method = acInstanceClass.getMethod("getOutputString");
		assertAnnotationsExpected(method.getAnnotations(),
				MethodAnnotation.class,
				GenericAnnotation.class);

		method = acInstanceClass.getMethod("main",
				new Class[] { String[].class });
		assertAnnotationsExpected(method.getAnnotations() /* none */ );
	}

}
