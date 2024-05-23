import java.util.Locale;
import java.util.ResourceBundle;

public class MessageReader {
    ResourceBundle resourceBundle;

    MessageReader() {
        @SuppressWarnings("deprecation")
        Locale locale = new Locale("en", "US");
        resourceBundle = ResourceBundle.getBundle("message", locale);
    }

    public String getMessage(String key) {
        return resourceBundle.getString(key);
    }

}
