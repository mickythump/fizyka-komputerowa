public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rysuję kółko");
    }

    @Override
    public void erase() {
        System.out.println("Wymazuję kółko");
    }
}
