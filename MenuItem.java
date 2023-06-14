public class MenuItem {
    //class variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //constructors
    public MenuItem(String name, String description, Double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = false;

    }
    public MenuItem(String name, String description, Double price, String category, boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;

    }
    //methods
    //getters and setters


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}
