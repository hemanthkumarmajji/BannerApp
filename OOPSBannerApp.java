import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Hemanth
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Part 2: Utility Static Method to create and populate the HashMap
     * @return A Map containing characters as keys and their string array patterns as values
     */
    public static Map<Character, String[]> createPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        // Load the patterns into the Map
        patternMap.put('O', new String[]{
            "  *** ", " ** ** ", "** ** ", "** ** ", "** ** ", " ** ** ", "  *** "
        });
        patternMap.put('P', new String[]{
            " ***** ", " ** ** ", " ** ** ", " ***** ", " ** ", " ** ", " ** "
        });
        patternMap.put('S', new String[]{
            " ***** ", " ** ", " ** ", " *** ", "   ** ", "   ** ", " ***** "
        });

        return patternMap;
    }

    /**
     * Part 2: Utility Static Method to display the banner
     * @param message The word to display
     * @param patternMap The map containing our letter patterns
     */
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        // Outer loop: iterates through the 7 lines of the banner
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            
            // Inner loop: iterates through each character in the message (O, O, P, S)
            for (char c : message.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[i]);
                }
            }
            // Print the fully assembled line
            System.out.println(sb.toString());
        }
    }

    /**
     * Part 3: Main Method
     */
    public static void main(String[] args) {
        // 1. Build the dictionary of letter patterns
        Map<Character, String[]> patternMap = createPatternMap();

        // 2. Render the banner using our reusable display function
        displayBanner("OOPS", patternMap);
    }
}