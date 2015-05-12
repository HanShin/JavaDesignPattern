package tablefactory;
import factory.*;
/**
 * Created by H2014154 on 2015-05-12.
 */
public class TableLink extends Link{

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
