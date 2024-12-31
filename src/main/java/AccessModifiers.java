// Updated AccessModifiers.java
public class AccessModifiers {

    // Access modifiers demonstrated here
    private String privateField = "I am private!"; // Accessible only within this class
    String defaultField = "I am package-private!"; // Accessible within the same package
    protected String protectedField = "I am protected!"; // Accessible to subclasses and same package
    public String publicField = "I am public!"; // Accessible from everywhere

    // A method to demonstrate all access levels within this class
    public void showAccess() {
        System.out.println("[DEBUG] Accessing fields within AccessModifiers:");
        System.out.println("privateField: " + privateField);
        System.out.println("defaultField: " + defaultField);
        System.out.println("protectedField: " + protectedField);
        System.out.println("publicField: " + publicField);
    }

    public static void main(String[] args) {
        AccessModifiers example = new AccessModifiers();

        System.out.println("[DEBUG] Demonstrating Access in Main Method:");
        example.showAccess(); // Demonstrates access from within class

        System.out.println("[DEBUG] Direct field access in main method:");
        // System.out.println(example.privateField); // Uncommenting causes compile error: private access
        System.out.println("defaultField: " + example.defaultField); // Accessible (same package)
        System.out.println("protectedField: " + example.protectedField); // Accessible (same package)
        System.out.println("publicField: " + example.publicField); // Accessible (public field)
    }
}