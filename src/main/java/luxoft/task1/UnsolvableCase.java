package luxoft.task1;

public class UnsolvableCase {
    public static void main(String[] args) {
        final Integer i = 1;
        switch (1) {
            case i:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }
    }
}
