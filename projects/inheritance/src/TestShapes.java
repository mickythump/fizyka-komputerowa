import java.util.Random;

public class TestShapes {
    public static void main(String[] args) {
        Shape[] shapesArray = new Shape[9];

        for(int i = 0; i < shapesArray.length; i++) {
            shapesArray[i] = next();
        }

        for(Shape sharr : shapesArray) {
            sharr.draw();
        }
    }

    static Shape next() {
        Random random = new Random();
        int randomNumber = random.nextInt(3)+1;
        if(randomNumber == 1) {
            return new Circle();
        }
        else if(randomNumber == 2) {
            return new Triangle();
        }
        else if(randomNumber == 3) {
            return new Square();
        }
        return null;
    }
}
