public class Challenge {

    public static void main(String[] args) {

        // Step 1
        double myFirstValue = 20.00d;

        // Step 2
        double mySecondValue = 80.00d;

        // Step 3
        double myValuesTotal  = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal: " + myValuesTotal);

        // Step 4
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The Remainder: " + theRemainder);

        // Step 5
        boolean isNoRemainder = Boolean.parseBoolean((theRemainder == 0) ? "true" : "false");
        System.out.println("IsNoRemainder: " + isNoRemainder);

        // Step 7
        System.out.println("Result Double: " + myValuesTotal);
        System.out.println("Result Remainder: " +theRemainder);
        System.out.println("IsNoRemainder: " + isNoRemainder);

        // Step 7
        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
