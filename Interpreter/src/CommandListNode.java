import java.util.ArrayList;

/**
 * Created by H2014154 on 2015-06-01.
 */
public class CommandListNode extends Node {
    private ArrayList list = new ArrayList();
    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
    public String toString(){
        return list.toString();
    }
}
