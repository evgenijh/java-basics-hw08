import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        String patternExp = "[0-2]?[0-9]{0,2}[.][0-2]?[0-9]{0,2}[.][0-2]?([0-5]{0,2}|8)[.][0-2]?([0-9]{0,2})";
        Pattern pattern = Pattern.compile(patternExp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}
