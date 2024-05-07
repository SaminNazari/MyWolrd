import java.util.List;

public class Shop {
    private  int id;
    private String name;
    private String type;
private List<Product> products;
    Shop(String name, String type,int id,List<Product> products){
        this.products=products;
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
