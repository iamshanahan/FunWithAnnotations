// package-info file to demonstrate applying annotations to packages.  Doesn't seem very useful.

// Package.  Weird to put annotation above "package".  Only in this file does that count as obj decl.
@GenericAnnotation // *always* accepted
//@AnnotationAnnotation // does not compile
//@ConstructorAnnotation // does not compile
//@FieldAnnotation // does not compile
//@LocalVarAnnotation // does not compile
//@MethodAnnotation // does not compile
@PackageAnnotation // *does* compile
//@ParameterAnnotation // does not compile
//@TypeAnnotation // does not compile
package targeted.classes;

import targeted.GenericAnnotation;
import targeted.PackageAnnotation;
