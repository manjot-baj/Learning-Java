class A {
    public void show1() {
        System.out.println("im in A");

    }

}

class B extends A {
    public void show2() {
        System.out.println("im in B");

    }

}

public class DemoUpcastingDowncasting {
    public static void main(String[] args) {
        A obj = new B(); // Reference of A and Object of B
        obj.show1(); // Upcasting

        B obj1 = (B) obj; // object typecasting
        obj1.show2(); // Downcasting

    }

}
