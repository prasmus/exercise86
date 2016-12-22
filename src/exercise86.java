/**
 * Created by Praktika on 22.12.2016.
 */
public class exercise86 {
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 2, 4};
        System.out.println(areFactors(a, n));
    }
    public static boolean areFactors(int[] a, int n) {
        for(int i = 0; i < a.length; i++) {
            if (n % a[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
