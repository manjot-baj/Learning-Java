/*
 * Class, Variable, Method Constant
 * In Java, we use camelCase
 * 
 * Classes should start with upper case like 
 * class Human, class BeingHuman
 * 
 * Variables and methods should start with lower case like
 *  int num; show(); , int myNum; showDown();
 * 
 * Constants should be All Capital like
 * PIE; BRAND_NAME
 * 
 */

class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class DemoNamingConvention {
    public static void main(String a[]) {

        new A(); // Anonymous Object
        new A().show(); // Anonymous Object
        // When we write this, this actualy creates object in heap memory , but because
        // we didnt assign any reference to the object , this object becomes a anonymous
        // object in heap memory
        A obj = new A(); // here we r calling the contructor of class for object creation
        obj.show();
    }
}