/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in a Class
 *
 * @author Hemanth
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Part 2: Inner Static Class
     * Encapsulates the character and its corresponding ASCII pattern
     */
    public static class CharacterPatternMap {
        // Instance Variables
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getters
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Part 3: Utility Static Method
     * Abstracts the lookup mechanism to return the right pattern object
     * * @param c the character to lookup
     * @return CharacterPatternMap object containing the pattern
     */
    public static CharacterPatternMap getCharacterPattern(char c) {
        if (c == 'O') {
            return new CharacterPatternMap('O', new String[]{
                "  *** ", " ** ** ", "** ** ", "** ** ", "** ** ", " ** ** ", "  *** "
            });
        } else if (c == 'P') {
            return new CharacterPatternMap('P', new String[]{
                " ***** ", " ** ** ", " ** ** ", " ***** ", " ** ", " ** ", " ** "
            });
        } else if (c == 'S') {
            return new CharacterPatternMap('S', new String[]{
                " ***** ", " ** ", " ** ", " *** ", "   ** ", "   ** ", " ***** "
            });
        }
        return null; // Return null if character is not found
    }

    /**
     * Part 4: Main Method
     */
    public static void main(String[] args) {
        
        // Array of Objects to manage multiple characters for the word "OOPS"
        CharacterPatternMap[] oopsArray = {
            getCharacterPattern('O'),
            getCharacterPattern('O'),
            getCharacterPattern('P'),
            getCharacterPattern('S')
        };

        // Array to hold the final assembled 7 lines of the banner
        String[] banner = new String[7];

        // Loop through 7 lines, using StringBuilder for efficient concatenation
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            
            // Loop through each letter object in our word
            for (CharacterPatternMap letterMap : oopsArray) {
                sb.append(letterMap.getPattern()[i]);
            }
            
            // Convert the built string and store it in our final banner array
            banner[i] = sb.toString();
        }

        // Output the final banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}