package Chapter7;

import java.util.Scanner;

public class Five {


    public static void main(String[] args) {

        new CheckedClass();

    }
}
final class CheckedClass {

    private int CHISLO;

    public CheckedClass() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

        checkedInterface.CheckedChislo();
    }

    CheckedInterface checkedInterface = () -> {

        String str_Yes = "Yes";
        String str_No = "No";

        if (CHISLO >= 0)
            System.out.println(str_Yes);
        else
            System.out.println(str_No);


    };


}

@FunctionalInterface
interface CheckedInterface {

    void CheckedChislo();

}

// task 7.5

