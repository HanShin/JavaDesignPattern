package listfactory;

import factory.Link;

/**
 * Created by H2014154 on 2015-05-11.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url){
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        return " <li><a href=\""+ url + "\">" + caption +"</a></li>\n";
    }

}
