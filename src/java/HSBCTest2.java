public class HSBCTest2 {

    public static void getSum() {

        Long sum = 0L;
        for (int i = 1; i < 2000000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        if (n == 1 || n % 2 == 0 && n != 2) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
