public class WhileLoop {
    public static void main(String a[]) {
        int i = 1;
        // loop and nested loop
        // outer loop
        while (i <= 5) {
            System.out.println("Hi" + i);
            int j = 1;
            // inner loop
            while(j<=4){
                System.out.println("Hello" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye");

        //do while
        int x = 6;
        do
        {
            System.out.println("Hurray" + x);
            x++;

        }while(x <= 5);
    }
}
