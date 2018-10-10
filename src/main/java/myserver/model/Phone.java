package myserver.model;

public class Phone {

    private Long id;
    private String name;
    private String os;
    private int price;

    public Phone() {
    }

    public Phone(Long id, String name, String os, int price) {
        this.id = id;
        this.name = name;
        this.os = os;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
