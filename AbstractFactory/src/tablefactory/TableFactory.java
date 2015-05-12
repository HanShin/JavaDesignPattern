package tablefactory;
import factory.*;
/**
 * Created by H2014154 on 2015-05-12.
 */
public class TableFactory extends Factory{
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
