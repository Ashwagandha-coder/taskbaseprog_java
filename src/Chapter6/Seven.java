package Chapter6;

import java.util.Scanner;

public class Seven {


    public static void main(String[] args) {

        new Checked4().CheckedChislo4();

    }
}

final class Checked4 {

    private final int CHISLO;


    public Checked4() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

    }

    public void CheckedChislo4() {

        if (CHISLO > 0 && (CHISLO / 100) > 0)
            System.out.println(CHISLO - 1);

    }


}

// task 6.7
