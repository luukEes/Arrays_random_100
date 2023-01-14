import java.util.Random;
/*
fill array with random numbers specified in constructor
 */
public class Main {
    public static void main(String[] args) {
        int [] randNumbers = new int[20];
        Random rClass = new Random();
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers [i] = rClass.nextInt(100);
        }
        for (int i = 0 ; i<randNumbers.length; i++) {
            System.out.print(randNumbers[i] + " ");
        }
    }
}

