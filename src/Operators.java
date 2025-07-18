public class Operators {
    public static void main(String[] args) {
        int a = 15;
        int b = a++;
        int c = b++;

        int result = a + b + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(result);
    }
}
