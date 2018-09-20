package martak.countdig;

public class CountDig {

    public static int nbDig(int n, int d) {

        int occurrence = 0;

        for (int i = 0; i <= n; i++) {

            int number = i * i;

            while (number >= 10) {
                if (number % 10 == d) {
                    occurrence++;
                }
                number /= 10;
            }

            if (number % 10 == d) {
                occurrence++;
            }
        }
        return occurrence;
    }
}
