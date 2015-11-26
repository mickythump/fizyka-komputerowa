class Dog extends Animal implements Moveable {
    Dog() { }
    Dog(String s) { name = s; }

    String getTyp()      { return "Pies";        }
    String getVoice()    { return "HAU HAU!"; }

    @Override
    public void startMoving() {
        System.out.println(getTyp() + " " + getName() + " " +"biegnie");
    }

    @Override
    public void stopMoving() {

    }
}