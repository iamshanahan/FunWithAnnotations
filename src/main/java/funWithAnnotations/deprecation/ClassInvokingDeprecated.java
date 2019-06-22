package funWithAnnotations.deprecation;

import funWithAnnotations.deprecation.ClassWithDeprecated.ClassWithDeprecatedMethod;
import funWithAnnotations.deprecation.ClassWithDeprecated.DeprecatedClass;

/**
 * Comment SuppressWarnings to see warnings appear. Note that top-level class is
 * the only place to suppress import warning.
 * 
 * @author bshanahan
 *
 */
@SuppressWarnings("deprecation")
public class ClassInvokingDeprecated {

	public class Inner {
		public int useDeprecatedClass() {
			DeprecatedClass dc = new DeprecatedClass();
			int x = dc.methodConsideredDeprecatedIfClassIs();
			return x;
		}
	}

	public int useDeprecatedMethod() {
		ClassWithDeprecatedMethod cdm = new ClassWithDeprecatedMethod();
		return cdm.deprecatedMethod();
	}
}
