class Pen{
    String color;
    double height;
    double weight;
    String brand;
    String madeIn;
    double price;
  
    void write(){
        System.out.println("This is a pen");
    }

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.write();
    }
}