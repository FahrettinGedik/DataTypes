public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("You are not an alien!");
            System.out.println("And I am scared of aliens too");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than secondTopScore and less than 100!");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("The value is 50");
        } else {
            System.out.println("The value is not 50");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("You are driving a car");
        } else {
            System.out.println("You are not driving a car");
        }


    }
}
