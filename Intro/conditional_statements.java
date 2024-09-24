public class conditional_statements {
    public static void main(String a[]) {
        // if else
        int x = 12;
        if (x > 10 && x < 20) {
            System.out.println("Hi");
        } else {
            System.out.println("Hello");
        }

        // if else and else if
        int y = 5;
        int z = 12;
        int w = 4;
        if (y > z && y > w) {
            System.out.println(y);
        } else if (z > w) {
            System.out.println(z);
        } else {
            System.out.println(w);
        }

    }

}
