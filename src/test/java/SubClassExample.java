// Updated SubClassExample.java
// Subclass in the same or different package
class SubClassExample extends AccessModifiers {
    public void accessTest() {
        System.out.println("[DEBUG] Accessing fields in SubClassExample:");

        // System.out.println(privateField); // Compile error: private access, even in subclass
        // System.out.println(defaultField); // Compile error if this class is in a different package
        System.out.println("protectedField: " + protectedField); // Accessible to subclass
        System.out.println("publicField: " + publicField); // Accessible (public field)
    }
}