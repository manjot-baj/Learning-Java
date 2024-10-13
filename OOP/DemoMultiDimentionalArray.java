class JaggedArray {
    public void jagged() {
        int jarray[][] = new int[3][];
        jarray[0] = new int[2];
        jarray[1] = new int[4];
        jarray[2] = new int[3];

        for (int i = 0; i < jarray.length; i++) {
            for (int j = 0; j < jarray[i].length; j++) {
                jarray[i][j] = (int) (Math.random() * 10);
                System.out.print(jarray[i][j] + " ");

            }
            System.out.println();

        }
    }

    public void enforloop() {
        int jarray[][] = new int[3][];
        jarray[0] = new int[2];
        jarray[1] = new int[4];
        jarray[2] = new int[3];

        for (int i[] : jarray) {
            for (int j : i) {
                j = (int) (Math.random() * 10);
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

public class DemoMultiDimentionalArray {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                nums[i][j] = (int) (Math.random() * 10);
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();

        }

        JaggedArray obj = new JaggedArray();
        obj.jagged();
        obj.enforloop();
    }

}
