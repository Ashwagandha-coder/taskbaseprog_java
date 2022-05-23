package Chapter6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Eleven {


    public static void main(String[] args) {

        new CheckedEleven();

    }
}

final class CheckedEleven implements CheckEleven {

    private final int CHISLO_1;
    private final int CHISLO_2;

    public CheckedEleven() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO_1 = scanner.nextInt();
        this.CHISLO_2 = scanner.nextInt();

        this.CheckNumbersEleven();

    }
    @Override
    public void CheckNumbersEleven() {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        if (CHISLO_1 > 0 && CHISLO_2 > 0)
            printStream.println("Один и тот же знак");
        else if (CHISLO_1 == 0 || CHISLO_2 == 0) {
            printStream.println("Некоректно");

        }
        else
            printStream.println("Разные знаки");


    }


}

interface CheckEleven { void CheckNumbersEleven(); }

// task 6.11
