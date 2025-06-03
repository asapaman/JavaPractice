import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        System.out.println("Enter Char: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else System.out.println("Uppercase");
    }
}
