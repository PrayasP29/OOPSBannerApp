public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store each banner line inside a String array
        String[] banner = {

            String.join("  ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", "*     *", "*"),
            String.join("  ", "*     *", "*     *", "****** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*", "      *"),
            String.join("  ", "*     *", "*     *", "*", "*     *"),
            String.join("  ", " ***** ", " ***** ", "*", " ***** ")

        };

        // Loop through array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}