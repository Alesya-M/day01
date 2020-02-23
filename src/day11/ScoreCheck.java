package day11;

public class ScoreCheck {

    public static void main(String[] args) {

        int scoreAsign = 100;

        if (scoreAsign < 0 || scoreAsign > 100) {

            System.out.println("INVALID SCORE!");
        } else if (scoreAsign == 100) {
            System.out.println("PERFECT SCORE");
        } else if (scoreAsign > 70 && scoreAsign < 100) {
            System.out.println("YOU HAVE PASSED!");
        }else if (scoreAsign< 20) {
            System.out.println("COME TO MY OFFICE");

        }else if (scoreAsign > 30 && scoreAsign<40) {
            System.out.println("Attend additional classes");

        }else if (scoreAsign > 40 && scoreAsign< 70) {
            System.out.println("NEED TO STUDY MORE!");
        } else {
            System.out.println("YOU HAVE FAILED! ");
        }
    }
}
