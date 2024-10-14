public class Shoe {
    // Fields (attributes of the shoe)
    private String brand;
    private String model;
    private String color;
    private double size;
    private double price;
    private String material;

    // Constructor
    public Shoe(String brand, String model, String color, double size, double price, String material) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.material = material;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Method to display shoe details
    public void displayShoeInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
        System.out.println("Material: " + material);
    }

    // Main method for testing
    public static void main(String[] args) {
        Shoe myShoe = new Shoe("Nike", "AirMax", "Black", 9.5, 120.00, "Leather");
        myShoe.displayShoeInfo();
    }
}
