package martak.countdig;

public class CountDig {

    public static int nbDig(int n, int d) {

        int occurrence = 0;

        for (int i = 0; i <= n; i++) {

            int number = i * i;

            while (true) {
                if (number % 10 == d) {
                    occurrence++;
                }
                if (number < 10) {
                    break;
                }
                number /= 10;
            }
        }
        return occurrence;
    }
}
