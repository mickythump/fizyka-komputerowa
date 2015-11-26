class Main {
    public static void main(String[] arg) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Alf");

        Dog dog1 = new Dog("Kuba");
        Dog dog2 = new Dog("Reksio");
        Dog dog3 = new Dog();

        Cat cat1 = new Cat();

        animalTalk(animal2, animal1);
        animalTalk(dog1, dog2);
        animalTalk(dog1, cat1);
        animalTalk(dog2, dog3);

        Car car1 = new Car("PO34567", 123);

        Moveable[] arr = {dog3, cat1, car1};

        wyscig(arr);
    }

    static void animalTalk(Animal z1, Animal z2) {
        z1.speak();
        z2.speak();

        System.out.println("----------------------------------------");
    }

    static void wyscig(Moveable[] objects)
    {
        for(int i = 0; i < objects.length; i++) {
            objects[i].startMoving();
        }

        System.out.println("----------------------------------------");
    }
}

