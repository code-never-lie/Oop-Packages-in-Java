Package
- Collection of related types(classes, interfaces etc)
- A package is a grouping of related types providing access protection and name space management. Note that   types refers to classes, interfaces, enumerations, and annotation types. (Sun Defination)
- specify package declaration at the beginning of the source file.
   package mypack;
- only one package declaration allowed per source file.
- import statement tells the compiler where to find classes in package
- package are stored in the folder containing the package name
- can be zipped into jar file

(See UML Diagram on Board)
...........................................................................
import statement
...........................................................................
- used to add package into java code
Example 1: Import all Classes in MyPack
          import MyPack.*;

Example 2: Import MyMath Class from  MyPack only
          import MyPack.MyMath;

Example 3 : Import Rectangle class
            import graphics.Rectangle;
            import graphics.Rectangle.*;
Be aware that the second import statement will not import Rectangle.

Note: The star form may increase compilation time—especially if you import several large packages. For this reason it is a good idea to explicitly name the classes that you want to use rather than importing whole packages. However, the star form has absolutely no effect on the run-time performance or size of your classes.
.................................................................................
Name Ambiguities and Full Qualified Names
...............................................................................
class name ambiguity should be resolved with full qualified names
Syntax  :    	    packagename.ClassName

Example :
import mypack.String;


String m= new String();//Already defined in java.lang (comiple time error)

mypack.String = new mypack.String();//ok (full Qualified name) 

..........................................................................
Package Naming Convention
.........................................................................
1- Lower case recommended
2- Package names are written in all lower case to avoid conflict with the names of classes or interfaces.

3- Companies use their reversed Internet domain name to begin their package names—for example,    com.example.mypackage for a package named mypackage created by a programmer at example.com.

.........................................................................................
ClassPath         (a environment variable)
...........................................................................          
 Operating System  store the value of this variable
How to set classpath?
a) on dos session (package stored in c:\temp)
   set classpath=c:\temp
 Note : it will over write previous class path
b) Preserve Current class path plus add new class path
   set classpath=%classpath%;c:\temp
it will concatenate previous classpath with new classpath
c) Current folder classpath
       set classpath=.
       OR
      set classpath=%classpath%;.
d) view class Path
     set classpath

-At Dos command it will work only for current Dos Session

- Set classpath at windows MyComputer Advance properties ( For permanent storage of class path )
      MyComputer->properties->Advanced

How to check current class path at DOs Prompt?

set classpath

set  (view all environment variables)
................................................................................................
Example :
    MyMath class with two functions 
             Sq and factorial

package MyPack; 
public class MyMath{
public int sq(int p){
   return p*p;
  }

public int factorial(int n){
   if (n==1)
       return 1;
   else
         return n* factorial(n-1);
 }
}

Note : - Class and methods should be public, inorder to access class             outside package
       - create folder named MyPack
       - Store MyMath.java file into folder MyPack
       - Compile file at MyPack  Folder
                  javac MyMath.java
       - set class path of MyPack Folder
                set classpath=%classpath%;c:\temp
..........................................................................................
Example : Add another MyPower class with (power(x,y)) method into MyPack Folder

package MyPack;
public class MyPower{
public int power(int x, int y){
  if (y==0)
      return 1;
  else
     return x* power(x,y-1);
}
}
.............................................................................................
Client program of MyPack
.............................................................................................
import MyPack.*;
class Test {
public static void main(String o[]){
MyMath m= new MyMath();
System.out.println(m.sq(2));
System.out.println(m.factorial(3));
MyPower pw= new MyPower();
System.out.println(pw.MyPower(2,3));
}
}
....................................................................................................
Class Scope within Package
....................................................................................................
-A  class has only two possible access levels: default and public.

-When a class is declared as public, it is accessible by any other code. 

-If a class has default access, then it can only be accessed by other code within its same package. 

-When a class is public, it must be the only public class declared in the source file, and the file must  have the same name as the class.
......................................................................................................

Problem : Create a package UCP with Student(name) and course(title)
         classes

         Student.java
package UCP;
public class Student{


}

          Course.java

package UCP;
public class Course{


}

...........................................................................................
References 
...........................................................................................
1- http://docs.oracle.com/javase/tutorial/java/package/index.html
2- Java- The Complete Reference  7th Edition
3- 

...........................................................................................








