# FunWithAnnotations
Exercising java annotation usage for my own betterment.

The main purpose of this project was to exercise my understanding of annotations.  There are quite a few subtleties around
inheritance, default values, repetition, and member types.

The secondary purpose was to take a stab at this idea I have of "tutorial in a project".  Instead of using a bunch of words to describe functional behavior, demonstrate every aspect of that behavior in isolated, canonical examples.  Then readers can grok the functional behavior by inspecting how it is exercised.

So this project contains examples whose purpose is to make clear every behavior of annotations.  The most glaring absence is probably type annotations, where one can annotate throws and casts and such.  I could have demonstrated type annotation placement, but I doubt that would be very illuminating.

I tried to name things to indicate their purpose, and add comments and javadoc where more context was needed.  (The project probably needs more.)  Unit tests are sometimes used to prove that the annotations and values are what we expect.  Other times, simply the ability for an annotation to be there makes its point.  There are a few instances where readers must participate, namely, uncommenting things that aren't supposed to work to see the error for themselves, and generating javadoc to observe the effect of @Documented.

