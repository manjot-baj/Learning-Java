class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }

}

public class DemoMethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2.1, 2.4));
    }
}
