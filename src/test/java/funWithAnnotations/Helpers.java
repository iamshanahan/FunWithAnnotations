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
		List<Class<? extends Annotation>> expectedAnnotClassList = new ArrayList<>(Arrays.asList(expectedAnnotClasses));
		for (Annotation observedAnnot : observedAnnots) {
			assertTrue(expectedAnnotClassList.contains(observedAnnot.annotationType()));
			expectedAnnotClassList.remove(observedAnnot.annotationType());
		}
		assertTrue(expectedAnnotClassList.isEmpty());
	}

//	// Do not use.  Need to declare as extends Object, syntax is escaping me.
//	@SafeVarargs
//	public static void assertAnnotationsExpected(Object o,
//			Class<? extends Annotation>... expectedAnnotClasses) {
//		assertAnnotationsExpected(o.getClass().getAnnotations(), expectedAnnotClasses);
//	}

}
