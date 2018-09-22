package martak.spider;

public class Dinglemouse {

    public static double spiderToFly(final String spider, final String fly) {

        int distBetweenRadials = Math.abs(spider.charAt(0) - fly.charAt(0));
        if (distBetweenRadials > 4) {
            distBetweenRadials = 8 - distBetweenRadials;
        }
        double spiderRing = spider.charAt(1) - 48;
        double flyRing = fly.charAt(1) - 48;

        switch (distBetweenRadials) {
            case 0:
                return Math.abs(spiderRing - flyRing);
            case 4:
                return spiderRing + flyRing;
            case 2:
                return Math.sqrt(Math.pow(spiderRing, 2) + Math.pow(flyRing, 2));
            default:
                double a = Math.sqrt(Math.pow(spiderRing, 2) / 2);
                double b;
                if (distBetweenRadials == 3) {
                    b = flyRing + a;
                } else {
                    b = flyRing - a;
                }
                return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        }
    }
}
