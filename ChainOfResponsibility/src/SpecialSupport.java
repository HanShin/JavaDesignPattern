/**
 * Created by H2014154 on 2015-05-14.
 */
public class SpecialSupport extends Support {
    private  int number;
    public SpecialSupport(String name,int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == number){
            return true;
        }else {
            return false;
        }
    }
}
