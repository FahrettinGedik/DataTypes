public class PrimitiveDataTypes {



    public static void main(String[] args) {
        // If block in the right place
        int age = 18;
        if(age >= 18) {
            System.out.println("You are adult!");
        } else {
            System.out.println("You are not adult!");
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println("Number = " + i);
        }

        // Integer overflow example
        int willThisCompile = Integer.MAX_VALUE + 1;
        System.out.println("willThisCompile = " + willThisCompile); // -2147483648

        long willThisCompile2 = 2147483648L; // Correct use
        System.out.println("willThisCompile2 = " + willThisCompile2);

        // Example of data types
        int anotherAge = 25;
        double salary = 3500.50;
        char letter = 'A';
        char symbol = '©';
        String name = "John";
        boolean answer = true;

        System.out.println("Age: " + anotherAge);
        System.out.println("Salary: " + salary);
        System.out.println("Letter: " + letter);
        System.out.println("Symbol: " + symbol);
        System.out.println("Name: " + name);
        System.out.println("Answer: " + answer);

        String text = "Java Programming";
        System.out.println(" text length = " +text.length()); // 16
        System.out.println("text.toUpperCase() = " + text.toUpperCase()); // "JAVA PROGRAMMING"

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[2]); // 3

        Integer number =  100;
        System.out.println(number.toString()); // "100" returns as a string

        // casting
        // widening casting( automatic conversion)
        int numberCasting = 9;
        double result = numberCasting; // Automatic conversion
        System.out.println(result); // 9.0

        // narrowing casting ( manuel conversion)
        double pi = 3.141559;
        int wholeNumber = (int) pi; // Fractional part of the number is dropped
        System.out.println(wholeNumber); // 3
        
    }
}



