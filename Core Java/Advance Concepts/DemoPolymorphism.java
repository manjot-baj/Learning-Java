final class D { // final keyword with class means class cannot be inherited

    public void show() {
        System.out.println("im in D show");
    }

}

class A {

    public void show() {
        System.out.println("im in A show");
    }

    public final void show2() { // final keyword with method means, Method cannot be override
        final double pie = 3.14; // final keyword with variable means, Making the variable constant
        System.out.println("im in A show");
        System.out.println(pie);
    }

}

class B extends A {

    public void show() { // method overriding
        System.out.println("im in B show");
    }

}

class C extends A {

    public void show() { // method overriding
        System.out.println("im in C show");
    }

}

public class DemoPolymorphism {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show(); // dynamic method dispatch, can only be possible with inheritance

        obj = new C();
        obj.show(); // runtime polymorphism

    }

}
