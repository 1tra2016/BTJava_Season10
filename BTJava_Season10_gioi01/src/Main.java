public class Main {
    public static void main(String[] args) {
        Computer c = new Computer();

        double p1 = c.calculatePrice(1000);
        System.out.println("Giá phải trả: " + p1);

        double p2 = c.calculatePrice(1000, 0.1);
        System.out.println("Giá phải trả: " + p2);

        double p3 = c.calculatePrice(1000, 0.1, 50);
        System.out.println("Giá phải trả: " + p3);
    }
}
