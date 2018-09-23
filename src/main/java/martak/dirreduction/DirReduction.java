package martak.dirreduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {

        List<String> plan = Arrays.asList(arr);

        boolean removed = true;
        while (removed) {
            removed = false;
            for (int i = 0; i < plan.size() - 1; i++) {
                if (isOpposite(plan.get(i), plan.get(i + 1))) {
                    plan.set(i, "");
                    plan.set(i + 1, "");
                    i++;
                    removed = true;
                }
                plan = plan.stream()
                        .filter(s -> !(s.equals("")))
                        .collect(Collectors.toList());
            }
        }

        return plan.toArray(new String[0]);
    }

    private static boolean isOpposite(String first, String second) {
        if (first.equals("EAST") && second.equals("WEST")) {
            return true;
        }
        if (first.equals("WEST") && second.equals("EAST")) {
            return true;
        }
        if (first.equals("NORTH") && second.equals("SOUTH")) {
            return true;
        }
        if (first.equals("SOUTH") && second.equals("NORTH")) {
            return true;
        }

        return false;
    }
}
