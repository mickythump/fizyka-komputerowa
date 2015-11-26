public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rysuję trójkąt");
    }

    @Override
    public void erase() {
        System.out.println("Wymauję trójkąt");
    }
}
