package myserver.dto;

public class OrderDTO {
    private Long id;
    private Long userId;
    private String username;
    private String email;
    private String phoneName;
    private String os;
    private int price;
    private String orderName;
    private String address;
    private String date;

    public OrderDTO() {
    }

    public OrderDTO(Long id, Long userId, String username, String email, String phoneName, String os, int price, String orderName, String address, String date) {
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.phoneName = phoneName;
        this.os = os;
        this.price = price;
        this.orderName = orderName;
        this.address = address;
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
