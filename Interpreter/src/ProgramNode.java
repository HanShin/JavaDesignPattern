/**
 * Created by H2014154 on 2015-06-01.
 */
public class ProgramNode extends Node {
    private Node commandListNode;
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
    public String toString(){
        return "[program " + commandListNode + "]";
    }
}
