package Models;

public class Product {
    private int id;
    private String name;
    private int price;
    private String chitiet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public Product(int id, String name, int price, String chitiet) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.chitiet = chitiet;
    }

    public Product() {
    }
}
