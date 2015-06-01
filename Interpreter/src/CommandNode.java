/**
 * Created by H2014154 on 2015-06-01.
 */
public class CommandNode extends Node {
    private Node node;
    @Override
    public void parse(Context context) throws ParseException {
        if(context.currentToken().equals("repeat")){
            node = new RepeatCommandNode();
            node.parse(context);
        } else{
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }
    public String toSTring(){
        return node.toString();
    }
}
