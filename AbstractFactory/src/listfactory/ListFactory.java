package listfactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * Created by H2014154 on 2015-05-11.
 */
public class ListFactory extends Factory{
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
}
