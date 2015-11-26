class Car implements Moveable {
    String nrrej;
    int tankcapacity;
    public Car(String nr, int tc) {
        nrrej = nr;
        tankcapacity = tc;
    }

    @Override
    public void startMoving() {
        System.out.println("Samochód " + nrrej + " jedzie");
    }

    @Override
    public void stopMoving() {

    }
}