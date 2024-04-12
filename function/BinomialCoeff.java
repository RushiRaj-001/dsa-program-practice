package function;

public class BinomialCoeff {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static int bincoeff(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);

        int fact_nr = factorial(n - r);

        int ans = fact_n / (fact_r * fact_nr);

        return ans;
    }

    public static void main(String[] args) {

        System.out.println("binomial coefficient is : " + bincoeff(5, 2));
    }
}
