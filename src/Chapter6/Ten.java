package Chapter6;

import java.util.Scanner;

public class Ten {


    public static void main(String[] args) {

        new Checked7();

    }
}

final class Checked7 {

    private int CHISLO;
    private Check2 check2 = () -> {

        if (CHISLO > CHISLO / 10 * CHISLO % 10)
            System.out.println(CHISLO);
        else
            System.out.println(CHISLO / 10 * CHISLO % 10);

    };
    public Checked7() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();
        check2.CheckedChislo7();
    }



}
@FunctionalInterface
interface Check2 { void CheckedChislo7(); }


// task 6.10