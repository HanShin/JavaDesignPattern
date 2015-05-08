package Exercise;

import java.io.*;
import java.util.Properties;

/**
 * Created by H2014154 on 2015-05-08.
 */
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(fileName);
        load(inputStream);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        store(outputStream,"");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
