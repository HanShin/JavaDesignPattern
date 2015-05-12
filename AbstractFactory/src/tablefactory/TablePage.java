package tablefactory;
import factory.*;

import java.util.Iterator;

/**
 * Created by H2014154 on 2015-05-12.
 */
public class TablePage extends Page {
    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>");
        buffer.append("<table width=\"80%\" border=\"3\"\n");
        Iterator it = content.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }

    public TablePage(String title, String author) {
        super(title, author);
    }
}