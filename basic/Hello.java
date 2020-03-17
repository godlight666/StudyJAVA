public class Hello{
    public static void main(final String[] args) {
        final int a = 72;
        final int b = 105;
        final int c = 65281;
        //fixme

        final String s = "" + (char) a + (char) b + (char) c;
        System.out.println(s);

    }

    static int test(final int a, final int b) {
        return a+b;
    }
}