package Chapter2;

public class Three {

    public static void main(String[] args) {

        new Print().printMark();

    }
}

class Print {

    private final String Mark1 = "+";
    private final String Mark2 = "!";
    private final String Mark3 = "?";

    public void printMark() {

        System.out.println(Mark1.repeat(3));
        System.out.println(Mark2.repeat(4));
        System.out.println(Mark3.repeat(2));

    }


}
