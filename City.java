import java.util.List;

public class City {
    private  int id;

    private String name;
    private String region;
    private List<District> districts;

    City(String name, String region,List<District> districts ,int id){
        this.districts=districts;
        this.id = id;
        this.name=name;
        this.region=region;
    }



}
