/**
 * Created by H2014154 on 2015-05-11.
 */
public class TicketMaker {
    private int ticket = 1000;
    private TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker(){
    }

    public TicketMaker getInstance(){
        return this.ticketMaker;
    }

    public int getNextTicketNumber(){
        return ticket++;
    }
}
