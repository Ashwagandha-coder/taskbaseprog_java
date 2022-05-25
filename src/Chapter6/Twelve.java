package Chapter6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Twelve {


    public static void main(String[] args) {

        ScannerValue();

    }

    public static void ScannerValue() {

        Scanner scanner = new Scanner(System.in);

        new SquareEquation(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).CheckEquation();

    }

}


final class SquareEquation {

    private final int A;
    private final int B;
    private final int C;

    public SquareEquation(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    public void CheckEquation() {

        int d = (int) (Math.pow(B,2) - 4 * A * C);

        if (d > 0)
            new PrintStream(System.out,true, StandardCharsets.UTF_8).println("Да");
        else
            new PrintStream(System.out,true, StandardCharsets.UTF_8).println("Нет");


    }

}

// task 6.12