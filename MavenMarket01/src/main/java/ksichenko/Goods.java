package ksichenko;

public class Goods {
    private String goodsName;
    private int goodsId;

    public Goods(int goodsId, String goodsName) {
        this.goodsName = goodsName;
        this.goodsId = goodsId;
    }

    public void printGoodsName() {
        System.out.println(goodsName);
    }

    public void printGoodsId() {
        System.out.println(goodsId);
    }
}

