/**
 * OOPSBannerApp
 *
 * UC6: Render OOPS as Banner using Static Functions
 *
 * @author Hemanth
 * @version 6.0
 */
public class OOPSBannerApp {

    // 1. Static helper method for the letter 'O'
    public static String[] getO() {
        return new String[] {
            "  *** ",
            " ** ** ",
            "** ** ",
            "** ** ",
            "** ** ",
            " ** ** ",
            "  *** "
        };
    }

    // 2. Static helper method for the letter 'P'
    public static String[] getP() {
        return new String[] {
            " ***** ",
            " ** ** ",
            " ** ** ",
            " ***** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // 3. Static helper method for the letter 'S'
    public static String[] getS() {
        return new String[] {
            " ***** ",
            " ** ",
            " ** ",
            " *** ",
            "   ** ",
            "   ** ",
            " ***** "
        };
    }

    public static void main(String[] args) {
        
        // Retrieve the arrays from our static methods
        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // UC6: Build the banner using the arrays
        String[] banner = {
            String.join("", o[0], o[0], p[0], s[0]),
            String.join("", o[1], o[1], p[1], s[1]),
            String.join("", o[2], o[2], p[2], s[2]),
            String.join("", o[3], o[3], p[3], s[3]),
            String.join("", o[4], o[4], p[4], s[4]),
            String.join("", o[5], o[5], p[5], s[5]),
            String.join("", o[6], o[6], p[6], s[6])
        };

        // Print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}