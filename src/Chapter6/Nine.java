package Chapter6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Nine {


    public static void main(String[] args) {

        new Checked6();

    }
}

final class Checked6 {

    private int CHISLO;
    private final Check check = () -> {

        if (CHISLO % 10 == CHISLO / 100 && (CHISLO % 100) / 10 == CHISLO % 10)
            new PrintStream(System.out,true, StandardCharsets.UTF_8).println("Четно-красивое");
        else
            System.out.println("Not");

    };

    public Checked6() {

        Scanner scanner = new Scanner(System.in);
        this.CHISLO = scanner.nextInt();

        check.CheckedChislo6();
    }




}

@FunctionalInterface
interface Check {

    void CheckedChislo6();

}
