// Updated AnotherClass.java
class AnotherClass {
    public void accessTest() {
        AccessModifiers example = new AccessModifiers();

        System.out.println("[DEBUG] Accessing fields in AnotherClass:");
        // System.out.println(example.privateField); // Compile error: private access
        System.out.println("defaultField: " + example.defaultField); // Accessible (same package)
        System.out.println("protectedField: " + example.protectedField); // Accessible (same package)
        System.out.println("publicField: " + example.publicField); // Accessible (public field)
    }
}