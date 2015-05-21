package drawer;

import command.Command;

import java.awt.*;

/**
 * Created by H2014154 on 2015-05-21.
 */
public class DrawCommand implements Command{

    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position){
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x,position.y);
    }
}
