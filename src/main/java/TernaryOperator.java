public class TernaryOperator {

    public static void main(String[] args) {

        // operand1 ? operand2 : operand3
        int x = 10;
        int y = 20;
        int z = (x > y) ? (x) : (y);
        System.out.println("z = " + z);

        String makeOfCar = "BMW";
        boolean isCar = (makeOfCar.equals("BMW")) ? true : false;
        boolean isDomestic = makeOfCar == "BMW" ? false : true;
        boolean isDomestic2 = (makeOfCar != "BMW");
        System.out.println("Is car domestic: " + isDomestic);
        System.out.println("Is car domestic2: " + isDomestic2);
        String carColor = (makeOfCar.equals("BMW")) ? "Black" : "White";
        System.out.println("Car color: " + carColor);

        if (isDomestic) {
            System.out.println("Domestic car!");
        } else {
            System.out.println("Foreign car!");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a child";
        System.out.println("Our Client is " + ageText);

        String s = (isDomestic) ? "Domestic" : "Foreign";
        System.out.println(s);
    }
}
