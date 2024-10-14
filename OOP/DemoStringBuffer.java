public class DemoStringBuffer {
    public static void main(String a[]) {
        // String is a Class and not Immutable by default
        // String contains a String Constant pool in heap memory, that maintain unique
        // strings and attach the address to the variables in stack
        // StringBuffer are mutable
        StringBuffer sb = new StringBuffer("Harry");
        System.out.println("Hashcode: " + sb.hashCode());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        sb.insert(5, " Pootter");
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.append(" Chambers of Secrets");
        System.out.println(sb);
        System.out.println("Hashcode: " + sb.hashCode());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
    }

}
