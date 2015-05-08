package idcard;

import framework.Product;

/**
 * Created by H2014154 on 2015-05-08.
 */
public class IDCard extends Product{
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public String getOwner(){
        return owner;
    }
}
