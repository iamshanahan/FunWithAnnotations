package funWithAnnotations.documented;

/**
 * This class exists to show how an annotation with @Documented shows up in the
 * class's documentation, and how an annotation without @Documented will not.
 * 
 * Generate the javadoc to see. Eclipse's javadoc preview does not work
 * reliably.
 * 
 * @author bshanahan
 *
 */
@DocumentedAnnotation("This annotation and String value will appear in javadoc")
@UndocumentedAnnotation("This annotation will not appear in this class's javadoc")
public class ClassInvokingDocumentAnnotation {

}
