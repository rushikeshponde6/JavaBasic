package javaOOps;

public class MethodOverriding7 {
    public static void main(String[] args) {
        MethodOverriding5 mo5 = new MethodOverriding6();
        //mo5.angry()    // unndefined
    }
}
/*
- You're declaring a reference variable mo5 of type MethodOverriding5 (the parent/superclass).
- You're assigning it an instance of MethodOverriding6 (the subclass).
🔄 Why It Works
Java allows upcasting: treating a subclass object as if it's an instance of its superclass. This lets you:
- Access overridden methods from MethodOverriding6 via the mo5 reference.
- Benefit from dynamic method dispatch at runtime (Java will call the subclass version of the method even though the reference is of superclass type).

 */