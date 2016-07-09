// 5. Design a class Point whose x and y coordinate values can be provided in a constructor. Provide a subclass LabeledPoint whose constructor takes a label value and x and y coordinates, such as Click here to view code image new LabeledPoint(" Black Thursday", 1929, 230.07)


// 6. Define an abstract class Shape with an abstract method centerPoint and subclasses Rectangle and Circle. Provide appropriate constructors for the subclasses and override the centerPoint method in each subclass.


// 7. Provide a class Square that extends java.awt.Rectangle and has three constructors: one that constructs a square with a given corner point and width, one that constructs a square with corner (0, 0) and a given width, and one that constructs a square with corner (0, 0) and width 0.


// 8. Compile the Person and SecretAgent classes in Section 8.6, “Overriding Fields,” on page 89 and analyze the class files withjavap. How many name fields are there? How many name getter methods are there? What do they get? (Hint: Use the -c and -private options.) 


// 9. In the Creature class of Section 8.10, “Construction Order and Early Definitions,” on page 92, replace val range with a def. What happens when you also use a def in the Ant subclass? What happens when you use a val in the subclass? Why?


// 10. The file scala/ collection/ immutable/ Stack.scala contains the definition Click here to view code image class Stack[ A] protected (protected val elems: List[ A]) Explain the meanings of the protected keywords. (Hint: Review the discussion of private constructors in Chapter 5.)