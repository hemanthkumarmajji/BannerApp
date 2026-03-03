/**
 * OOPSBannerApp
 *
<<<<<<< HEAD
 * UC2: Render OOPS as Banner using Print Statements
 *
 * @author Hemanth
 * @version 2.0
=======
 * UC5: Render OOPS as Banner using Inline Array Initialization
 *
 * @author Hemanth
 * @version 5.0
>>>>>>> main
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC5: Inline Array Initialization using String.join()
        // We use an empty string "" as the delimiter to glue your exact strings together
        String[] banner = {
            String.join("", "  *** ", "  *** ", " ***** ", " ***** "),
            String.join("", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join("", "** ** ", "** ** ", " ** ** ", " ** "),
            String.join("", "** ** ", "** ** ", " ***** ", " *** "),
            String.join("", "** ** ", "** ** ", " ** ", "   ** "),
            String.join("", " ** ** ", " ** ** ", " ** ", "   ** "),
            String.join("", "  *** ", "  *** ", " ** ", " ***** ")
        };

        // UC5: Enhanced For-Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
