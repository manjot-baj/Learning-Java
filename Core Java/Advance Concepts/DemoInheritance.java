class A {

    public void show() {

        System.out.println("in A show");

    }

}

class B extends A { // single level inheritance

}

class C extends B { // Multi level  inheritance

}

class D extends C { // Multi level  inheritance with Method Overriding
    public void show() {

        System.out.println("in D show");

    }

}

public class DemoInheritance {

    public static void main(String[] args) {

        C obj = new C();
        D obj1 = new D();

        obj.show();
        obj1.show(); // overriding show method

    }

}
