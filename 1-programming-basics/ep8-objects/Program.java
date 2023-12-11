public class Program {

    public static void main(String[] args) {
        Flight one = new Flight("Foo", "XYZ", "ABC", 3.14, 60, 10, 100);
        Flight two = new Flight("Bar", "XYZ", "ABC", 1.23, 120, 19, 70);

        System.out.println(one);
        System.out.println(two);
    }
}