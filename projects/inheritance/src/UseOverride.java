public class UseOverride {
    public static void main(String[] args) {
        Object[] arr = { new A(), new B(), new C() };
        for(Object o : arr) {
            System.out.println(o);
        }
    }
}

class A {
    public String ToString() {
        return "Obiekt klasy A";
    }
}

class B {
    public String toString() {
        return "Obiekt klasy B";
    }
}

class C extends B {
    public String toString(String ... myMsg) {
        String s = "Obiekt klasy C";
        if(myMsg.length == 1) {
            s += myMsg[0];
        }
        return s;
    }
}
