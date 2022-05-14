package Chapter2;

public class Four {


    public static void main(String[] args) {

        new Print2().printMark2();
    }
}

class Print2 {

    private final String Mark1 = "+";
    private final String Mark2 = "!";
    private final String Mark3 = "?";

    public void printMark2() {

        System.out.print(Mark1.repeat(3));
        System.out.print(Mark2.repeat(4));
        System.out.print(Mark3.repeat(2));

    }

}
