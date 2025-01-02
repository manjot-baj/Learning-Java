class Mobile {
    String brand; /* instance Variable */
    int price; /* instance Variable */
    static String name; /* Static Variable */

    /*
     * When we create class object then Class loads and Object get instanciated
     * Static block is used for intializing the static variable value and it is
     * loads when class loads
     * and class loads only once and u can create multiple objects, so no need to
     * call
     * static variable multiple times
     */

    static {
        name = "Phone";
        System.out.println("I'm Static Block");
    }

    /*
     * Construtor is called when object is instanciated
     */

    public Mobile() {
        brand = ""; // defaut value
        price = 0; // defaut value
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    //static method
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class DemoStatic {
    public static void main(String a[]) throws ClassNotFoundException {

        /*
         * In java the class loads and object instanciated when we create class object,
         * if no object is created then the class will not load.
         * in case u just need to load class without creating object then we use class
         * Class static Method forName, static method can be called with class name
         * itself and it throws ClassNotFoundException
         */

        Class.forName("Mobile");

        Mobile mobileObj1 = new Mobile();
        mobileObj1.brand = "SamSung";
        mobileObj1.price = 15000;

        Mobile mobileObj2 = new Mobile();
        mobileObj2.brand = "Apple";
        Mobile.name = "SmartPhone"; /*
                                     * Static Variable is a class member can call with class name and will be common
                                     * for all objects
                                     */
        mobileObj2.price = 95000;

        mobileObj1.show();
        mobileObj2.show();

        Mobile.show1(mobileObj1); // static method call
        Mobile.show1(mobileObj2);
    }
}