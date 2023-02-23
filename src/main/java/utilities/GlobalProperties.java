package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalProperties {

    public String properties(String key) throws IOException {
        FileInputStream fis =
                new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\global" + ".properties");
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }
}
