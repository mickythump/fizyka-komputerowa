public class Shapes {
    public static void main(String[] args) {
        Object[] shapeList = {
                new Circle1(),
                new Square1(),
                new Triangle1()
        };

        for(int i = 0; i < shapeList.length; i++) {
            ((Shape1)shapeList[i]).draw();
        }
    }
}

class Shape1 {
    void draw() {
        System.out.println(this + " rysuję");
    }
}

class Circle1 extends Shape1 {
    public String toString() { return "kółko"; }
}

class Square1 extends Shape1 {
    public String toString() { return "kwadrat"; }
}

class Triangle1 extends Shape1 {
    public String toString() { return "trójkąt"; }
}