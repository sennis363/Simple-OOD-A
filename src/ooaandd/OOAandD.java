package ooaandd;

public class OOAandD {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        System.out.println(dog.getAge(5));
        dog.speak();
        
        System.out.println(cat.getAge(7));
        cat.speak();
    }
}
