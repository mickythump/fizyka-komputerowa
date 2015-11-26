class Cat extends Animal implements Moveable{
    Cat()         { }

    String getTyp()      { return "Kot";        }
    String getVoice()    { return "Miauuuu..."; }

    @Override
    public void startMoving() {
        System.out.println(getTyp() + " " + getName() + " " +"skrada się");
    }

    @Override
    public void stopMoving() {

    }
}