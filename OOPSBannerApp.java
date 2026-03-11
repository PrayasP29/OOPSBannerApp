public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Render banner
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    // Helper method for O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for P
    public static String[] buildP() {
        return new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        };
    }

    // Helper method for S
    public static String[] buildS() {
        return new String[]{
                " *****",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                "***** "
        };
    }
}