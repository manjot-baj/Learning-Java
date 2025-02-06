class A extends Object { // Every class in java is inheriting Objects class

    public A() { // default constructor, we dont need to write this ts already there, if we want
                 // to change
                 // anything explicitly we can in this
        super(); // super method, Its already there by default and it calls the constructor of
                 // the Super class
        System.out.println("in A");

    }

    public A(int num) { // parameterized constructor
        super();
        System.out.println(num + "in A int");
    }

}

class B extends A { // inheriting A

    public B() { // default constructor
        super();
        System.out.println("in B");

    }

    public B(int num) { // parameterized constructor
        this(); // this method calls the constructor of the same class
        System.out.println(num + "in B int");
    }

}

public class DemoSuperExample {
    public static void main(String[] args) {

        B b = new B();

        System.out.println(b);

    }
}
