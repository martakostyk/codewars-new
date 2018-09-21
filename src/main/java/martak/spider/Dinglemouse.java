package martak.spider;

public class Dinglemouse {
    public static double spiderToFly(final String spider, final String fly) {

        if (spider.charAt(0) == fly.charAt(0)) {
            return Math.abs(spider.charAt(1) - fly.charAt(1));
        } else if (Math.abs(spider.charAt(0) - fly.charAt(0)) == 4) {
            return (spider.charAt(1) - 48) + (fly.charAt(1) - 48);
        } else {
            // twierdzenie cosinusów
            double a = spider.charAt(1) - 48;
            double b = fly.charAt(1) - 48;
            int angle = ((Math.abs(spider.charAt(0) - fly.charAt(0))) % 4) * 45;
            return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angle));
        }
    }
}
