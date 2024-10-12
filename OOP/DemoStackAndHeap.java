/*
 * 
 * 1. **Stack and Heap Memory**:
 * - When you create an instance of a class (`Calculator obj1 = new
 * Calculator();`), the reference `obj1` is stored in the stack, while the
 * actual object (`Calculator`) is stored in the heap.
 * - The stack contains method frames, and each method call has its own stack
 * frame with local variables. For example, in the `main` method, `obj1` and
 * `obj2` are local variables stored in the stack, but they point to objects in
 * the heap.
 * 
 * 2. **Object Reference and Heap**:
 * - `obj1` and `obj2` are references to different `Calculator` objects created
 * in the heap. The two objects are independent of each other.
 * - When you modify `obj1.num`, you are changing the `num` value for the object
 * that `obj1` points to, not for `obj2`.
 * 
 * 3. **Method Call**:
 * - When `obj1.add(30, 20)` is called, a stack frame is created for the `add`
 * method. `n1` and `n2` are local variables in the stack for that method. Once
 * the method returns, the frame is removed from the stack.
 * 
 * ### Output:
 * - `obj1.add(30, 20)` will return 50, as it adds the two arguments.
 * - `obj1.num` will print 8 because you set it to 8 for `obj1`.
 * - `obj2.num` will still print 5, as `obj2` refers to a different object in
 * the heap and was not modified.
 * 
 */

class Calculator {
    int num = 5;

    public int add(int n1, int n2) {
        return n1 + n2;
    }

}

public class DemoStackAndHeap {

    public static void main(String[] args) {
        // each method have its own stack that contains variable with key value pair.
        Calculator obj1 = new Calculator(); // creates object1 in heap memory, and assign the memory address to as value
                                            // to stack key obj1.
        Calculator obj2 = new Calculator(); // creates object2 in heap memory, and assign the memory address to as value
                                            // to stack key obj2.

        obj1.num = 8; // changes only effects on obj1 not on obj2.
        System.out.println(obj1.add(30, 20));
        System.out.println(obj1.num);
        System.out.println(obj2.num);
    }

}
