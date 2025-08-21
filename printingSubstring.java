import java.util.Scanner;

public class printingSubstring {
    public static void substring(String str,String curr) {
        if (str.isEmpty()) {
            System.out.println(curr);
            return;
        }
        char ch=str.charAt(0);
        String rem=str.substring(1);
        substring(rem, curr+ch);
        substring(rem,curr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String s=sc.nextLine();
        String curr=" ";
        substring(s,curr);
    }
}
