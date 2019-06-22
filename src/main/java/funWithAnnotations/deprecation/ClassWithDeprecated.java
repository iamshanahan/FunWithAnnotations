package funWithAnnotations.deprecation;

/**
 * Class with deprecation examples
 * 
 * @author bshanahan
 *
 */
public class ClassWithDeprecated {

	/**
	 * Class that is
	 * 
	 * @deprecated to demonstrate deprecation behavior
	 * @author bshanahan
	 *
	 */
	@Deprecated
	public static class DeprecatedClass {

		public int methodConsideredDeprecatedIfClassIs() {
			return 0;
		}
	}

	/**
	 * Class with method that is
	 * 
	 * @deprecated to demonstrate deprecation behavior
	 * @author bshanahan
	 *
	 */
	public static class ClassWithDeprecatedMethod {

		@Deprecated
		public int deprecatedMethod() {
			return 0;
		}
	}
}
