package Chapter6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        new Checked2().CheckedChislo2();

    }
}

class Checked2 {

    private final int CHISLO;


    public Checked2() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

    }

    public void CheckedChislo2() {

        if (CHISLO == 0)
            new PrintStream(System.out,true, StandardCharsets.UTF_8).println("Ноль");
        else
            System.out.println(CHISLO);



    }


}

// task 6.5
