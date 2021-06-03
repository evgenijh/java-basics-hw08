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
        String patternExp = "((25[4-5]|\\d|1\\d\\d)\\.){3}(\\d?\\d?\\d?\\d?)";
        Pattern pattern = Pattern.compile(patternExp);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}


