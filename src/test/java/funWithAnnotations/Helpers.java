package funWithAnnotations;

import static org.junit.Assert.assertTrue;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helpers {

	@SafeVarargs
	public static void assertAnnotationsExpected(Annotation[] observedAnnots,
			Class<? extends Annotation>... expectedAnnotClasses) {
		List<Class<? extends Annotation>> expectedAnnotClassList = new ArrayList<>(
				Arrays.asList(expectedAnnotClasses));
		try {
			for (Annotation observedAnnot : observedAnnots) {
				assertTrue(expectedAnnotClassList.contains(observedAnnot.annotationType()));
				expectedAnnotClassList.remove(observedAnnot.annotationType());
			}
			assertTrue(expectedAnnotClassList.isEmpty());
		} catch (AssertionError e) {
			StringBuilder builder = new StringBuilder("Annotations do not match:\nExpected:< ");
			for (Class<? extends Annotation> clazz : expectedAnnotClasses) {
				builder.append(clazz.toString()).append(' ');
			}
			builder.append(">\nObserved:< ");
			for (Annotation annot : observedAnnots) {
				builder.append(annot.annotationType().toString()).append(' ');
			}
			builder.append('>');
			throw new AssertionError(builder.toString());
		}
	}

//	// Do not use.  Need to declare as extends Object, syntax is escaping me.
//	@SafeVarargs
//	public static void assertAnnotationsExpected(Object o,
//			Class<? extends Annotation>... expectedAnnotClasses) {
//		assertAnnotationsExpected(o.getClass().getAnnotations(), expectedAnnotClasses);
//	}

}
