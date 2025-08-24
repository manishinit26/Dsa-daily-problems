import java.util.Scanner;
class Main {
    public static int countKConstraintSubstrings(String s, int k) {
        char[] arr = s.toCharArray();
        long countZeros = countWithK(arr, k, '0');
        long countOnes = countWithK(arr, k, '1');
        long totalValid = countZeros + countOnes - countBoth(arr, k);
        return (int) totalValid;
    }
    public static long countWithK(char[] s, int k, char target) {
        long ans = 0;
        int left = 0, cnt = 0;
        for (int right = 0; right < s.length; right++) {
            if (s[right] == target) cnt++;
            while (cnt > k) {
                if (s[left] == target) cnt--;
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
    public static long countBoth(char[] s, int k) {
        long ans = 0;
        int left = 0, zeros = 0, ones = 0;
        for (int right = 0; right < s.length; right++) {
            if (s[right] == '0') zeros++;
            else ones++;
            while (zeros > k || ones > k) {
                if (s[left] == '0') zeros--;
                else ones--;
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.nextLine();
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        int result = countKConstraintSubstrings(s, k);
        System.out.println("Number of valid substrings: " + result);
        sc.close();
    }
}
