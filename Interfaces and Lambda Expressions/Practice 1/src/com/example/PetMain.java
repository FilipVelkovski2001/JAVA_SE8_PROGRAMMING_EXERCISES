package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        
        //test a spider with an animal reference
        Animal spidey = new Spider();
        spidey.eat();
        spidey.walk();
        
        a = new Spider();
        a.eat();
        a.walk();
        
        Pet f = new Fish();
        f.setName("Ribo");
        f.play();
        
        Pet cat = new Cat("Maxy");
        cat.play();
        Animal catA = new Cat("Lila");
        catA.eat();
        
        playWithAnimal(spidey);
        playWithAnimal(catA);
        
    }
    
    static Animal animal;
    
    public static void playWithAnimal(Animal a) {
    
    	animal = a;
    	animal.eat();
    	animal.walk();
    	
    	
    }
    
}