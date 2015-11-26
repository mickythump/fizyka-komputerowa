
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Rysuję kwadrat");
    }

    @Override
    public void erase() {
        System.out.println("Wymazuję kwadrat");
    }
}
