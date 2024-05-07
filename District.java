import java.util.List;

public class District {
    private int id;
    private String name;
    private double priceFactor;
    private List<Shop> shop;

    public District(int id, String name, double priceFactor,List<Shop> shop) {
        this.shop = shop;
        this.id = id;
        this.name = name;
        this.priceFactor = priceFactor;
    }
}
