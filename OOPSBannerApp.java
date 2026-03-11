import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // HashMap to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        patternMap.put('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                "***** "
        });

        String word = "OOPS";
        int height = 7;

        // Render banner
        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c)[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}