package Chapter6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Eight {


    public static void main(String[] args) {

        new Checked5().CheckedNumbers();

    }
}

class Checked5 {

    private final int CHISLO_1;
    private final int CHISLO_2;

    public Checked5() {

        Scanner scanner = new Scanner(System.in);


        this.CHISLO_1 = scanner.nextInt();
        this.CHISLO_2 = scanner.nextInt();
    }

    public void CheckedNumbers() {

        if (CHISLO_1 > CHISLO_2)
            System.out.println(CHISLO_1 + CHISLO_2);
        else if (CHISLO_2 > CHISLO_1) {

            System.out.println(CHISLO_1 * CHISLO_2);

        }
        else
            new PrintStream(System.out,true, StandardCharsets.UTF_8).println("Числа равны");


    }


}

// task 6.8