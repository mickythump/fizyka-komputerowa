class Animal {
    String name = "nieznany";

    Animal() { }
    Animal(String s) { name = s; }

    String getTyp()      { return "Jakis zwierz"; }
    String getName()     { return  name;   }
    String getVoice()    { return "?"; }

    void speak()  {
        System.out.println(getTyp()+" "+getName()+" mówi "+getVoice());
    }
}  