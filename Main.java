package recursion_tutorial.sum_natural_number;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(0));
        System.out.println(sum(1));
        System.out.println(sum(5));
        System.out.println(sum(10));
        System.out.println(sum(100));
        System.out.println(sum(11100));
    }
    public static long sum(long n){
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}
