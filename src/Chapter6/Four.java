package Chapter6;

import java.util.Scanner;

public class Four {


    public static void main(String[] args) {

        new Checked().CheckedChislo();

    }
}

final class Checked {

    private final int CHISLO;

    public Checked() {

        Scanner scanner = new Scanner(System.in);
        this.CHISLO = scanner.nextInt();

    }

    public void CheckedChislo() {

      if (CHISLO > 0)
          System.out.println(CHISLO * 2);
      else
          System.out.println(CHISLO);

    }



}

// task 6.4