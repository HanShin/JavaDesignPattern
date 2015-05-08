package Exercise;

import java.io.IOException;

/**
 * Created by H2014154 on 2015-05-08.
 */
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws  IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
