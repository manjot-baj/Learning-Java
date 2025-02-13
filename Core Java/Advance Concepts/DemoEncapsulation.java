class Human { // encapsulated the variables, cannot be used directly

    private int age; // always keep instance variables as private, private variables can be used only
                     // within same class
    private String name;

    public Human() { // contructor is called everytime we create object, this is a default
                     // constructor
        age = 18;
        name = "John Doe";

    }

    public Human(int age, String name) { // parameterized contructor
        this.age = age;
        this.name = name;

    }

    public int getAge() { // getter
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) { // setter
        this.age = age;
    }

    public void setName(String name) {
        this.name = name; // this keyword, to tell function that this is instance variable
    }

}

public class DemoEncapsulation {

    public static void main(String a[]) {

        Human humanObj = new Human();
        Human humanObj1 = new Human(27, "Manjot");
        System.out.println(humanObj1.getName() + ":" + humanObj1.getAge());

        int age = 27;
        String name = "Manjot";

        humanObj.setAge(age);
        humanObj.setName(name);

        System.out.println(humanObj.getName() + ":" + humanObj.getAge());
    }

}
