package Chapter6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Six {


    public static void main(String[] args) {

        new Checked3().CheckedChislo3();

    }
}

final class Checked3 {

    private final int CHISLO;

    public Checked3() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

    }

    public void CheckedChislo3() {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        if (CHISLO > 0)
            printStream.println("Положительное");
        else if (CHISLO < 0) {

            printStream.println("Отрицательное");
        }
        else
            printStream.println("Ноль");

    }


}

// task 6.6
