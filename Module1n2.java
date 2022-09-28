import java.util.*;
import java.lang.*;

public class Module1n2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Enter positions, for example \'a1-b3\' or \'x\' for exit");
        String currPos;
        String nextPos;
        String move = inputUser.next();
        while (!"x".equals(move)) {
            currPos = move.split("-")[0].toLowerCase();
            nextPos = move.split("-")[1].toLowerCase();
            if (isRightMove(currPos.charAt(0), Character.digit(currPos.charAt(1), 10),
                    nextPos.charAt(0), Character.digit(nextPos.charAt(1), 10)))
                System.out.println("Right move");
            else System.out.println("Wrong move");
            move = inputUser.next();
        }
    }

    private static boolean isRightPositionOnBoard(char letter, int num) {
        return (letter < 'a' || letter > 'h') || (num < 1 || num > 8);
    }

    private static boolean isRightMove(char letCurrPos, int numCurrPos, char letNewPos, int numNewPos) {
        return (!isRightPositionOnBoard(letCurrPos, numCurrPos) ||
                !isRightPositionOnBoard(letNewPos, numNewPos)) &&
                Math.abs(letCurrPos - letNewPos) + Math.abs(numCurrPos - numNewPos) == 3;
    }
}
