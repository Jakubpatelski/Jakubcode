public class Bike {
    String brand;
    String color;
    boolean isWorking;
    int height;
    int width;
    int length;

     public Bike (String brand, String color, boolean isWorking, int height, int width, int length) {
        this.brand = brand;
        this.color = color;
        this.isWorking = isWorking;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "brand: " + brand + " color: " + color + " isWorking: " + isWorking + " height: " + height + " width: " + width + " length: " + length;}

    public void calculate () {
        int total = this.height * this.length * this.height;
        System.out.println(total + " cm is " + this.brand + " size");
    }

    }

