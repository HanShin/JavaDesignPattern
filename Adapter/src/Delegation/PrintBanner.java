package Delegation;

import Inheritance.Print;

/**
 * Created by H2014154 on 2015-05-08.
 */
public class PrintBanner implements Print {

    private Banner banner;
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
