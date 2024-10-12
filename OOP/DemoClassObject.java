
class Calculator{
    public int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
}

public class DemoClassObject {
    public static void main(String[] args) {
        int x = 3000;
        int y = 51234;
        Calculator calc = new Calculator();
        int result = calc.add(x, y);
        System.out.println(result);
    }
    
}
