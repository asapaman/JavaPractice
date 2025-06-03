public class LargestNumber {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int c= 11;

        if (a>b && a>c){
            System.out.println("The Largets number is: "+ a);
        } else if (b>c && b>a) {
            System.out.println("The Largest number is: "+ b);
        }
        else System.out.println("The Largest Number is: "+ c);
    }
}
