package lk.myClass;

import java.util.Objects;

//Class
public class MyClass {
    //attribute
    private int count;

    //What is the method ------------------------------------------------------------------------|
// A Java method is a collection of statements that are grouped together to perform an operation |
    /*
    modifier returnType nameOfMethod (Parameter List) {
       method body
       }
   *&* modifier −> It defines the access type of the method and it is optional to use.
        {private, public, default, }
   *&* returnType −> Method may return a value.
        {int, Integer, String, BigDecimal, List<String>, List<Object>, etc...}
   *&* nameOfMethod −> This is the method name.
        {start with lower case letter, after if contain multiple word, first letter of word should be capital}
        The method signature consists of the method name and the parameter list.
   *&* Parameter List −> The list of parameters, it is the type, order, and number of parameters of a method.
         These are optional, method may contain zero parameters.
   *&* method body −> The method body defines what the method does with the statements.

        */

    //-------------------------------------------------------------------------------------------|
  /*                                                                                             |
   A class contains constructors that are invoked to create objects from the class blueprint.    |
   Constructor declarations look like method declarations—except that they use the name of       |
   the class and have no return type.                                                            |
   *&* Constructor Type                                                                          |
    1. No-Arg Constructor                                                                        |
                    private Constructor() {                                                      |
                   // body of constructor                                                        |
                    }                                                                            |
    2. Default Constructor                                                                       |
                Java compiler will automatically create a no-argument constructor during run-time|
    3. Parameterized Constructor                                                                 |
                private Constructor (arg1, arg2, ..., argn) {                                    |
                    // constructor body                                                          |
                }                                                                                |
     */                                                                                        //|
    //-------------------------------------------------------------------------------------------|
    //All arguments constructor
    public MyClass(int count) {
        this.count = count;
    }

    //No Arguments constructor
    public MyClass() {
    }

    //Set and Get methods are a pattern of data encapsulation.
    //provide public get and set methods to access and update the value of a private variable
    //get method -> get method returns the variable value
    public int getCount() {
        return count;
    }

    //set method -> set method sets the value
    public void setCount(int count) {
        this.count = count;
    }

    //equal method
    //The method determines whether the Number object that invokes the method is equal
    // to the object that is passed as an argument.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return count == myClass.count;
    }

    //hash code method
    //This method returns a hash code for this string
    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    //toString method
    //string representation of the object. In general, the toString method returns a string that "textually represents" this object.
    @Override
    public String toString() {
        return "MyClass{" +
                "count=" + count +
                '}';
    }
}
