import java.util.Scanner;

public class traversingInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array you want:"+" ");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the Elements");
        for(int i=0;i<l;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
        }
        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
}
