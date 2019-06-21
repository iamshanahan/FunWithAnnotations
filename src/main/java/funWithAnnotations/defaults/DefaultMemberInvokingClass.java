package funWithAnnotations.defaults;

public class DefaultMemberInvokingClass {

	// @SingleMember // does not compile
	@SingleMember(value = "provided value")
	public static int mustProvideValueIfNoDefault;

	@SingleMember("provided value")
	public static int memberNameCanBeOmitted;

	// @SingleMemberMisnamed("provided value") // does not compile
	@SingleMemberMisnamed(notNamedValue = "provided value")
	public static int butOnlyIfNamed_value_;

	@MultipleMember("provided value for member named value")
	public static int annotationsWithMultiMembersMayBeTreatedAsSingleMembered;

	// @MultipleMemberLackingDefault( "foo" ) // does not compile
	// @MultipleMemberLackingDefault( "foo", somethingLackingDefault=3 ) // does not
	// compile
	@MultipleMemberLackingDefault(value = "foo", somethingLackingDefault = 3)
	public static int butOnlyIfAllOtherMembersHaveDefaultValues;
}
