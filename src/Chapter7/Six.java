package Chapter7;

import java.util.Scanner;

public class Six {


    public static void main(String[] args) {

        new CheckedClass2();


    }
}

final class CheckedClass2 {

    private transient int Chislo_1;
    private transient int Chislo_2;

    public CheckedClass2() {

        Scanner scanner = new Scanner(System.in);

        this.Chislo_1 = scanner.nextInt();
        this.Chislo_2 = scanner.nextInt();
        scanner.close();
        checkedInterface2.CheckedChislo2();

    }

    CheckedInterface2 checkedInterface2 = () -> {

        String str_true = "Yes";
        String str_false = "No";

        if (Chislo_1 == Chislo_2)
            System.out.println(str_true);
        else
            System.out.println(str_false);



    };


}
@FunctionalInterface
interface CheckedInterface2 {

    void CheckedChislo2();
}


























