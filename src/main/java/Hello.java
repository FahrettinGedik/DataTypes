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

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than secondTopScore and less than 100!");
        }
    }
}
