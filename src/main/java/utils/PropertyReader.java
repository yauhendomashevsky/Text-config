package utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertyReader {

    public static ResourceBundle getBundle(String bundleName) {
        return ResourceBundle.getBundle(bundleName);
    }
}
