package propertiesfilereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
    private String propFileName;

    private Properties properties;


    public PropertyFileReader(final String propertyfile) {
        this.propFileName = propertyfile;
        loadProperty();
    }

    public String getproperty(String key){
        String value = properties.getProperty(key);
        return value;
    }

    private void loadProperty() {
        InputStream is = null;

        try{
            is = new FileInputStream(propFileName);
            properties = new Properties();
            properties.load(is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
