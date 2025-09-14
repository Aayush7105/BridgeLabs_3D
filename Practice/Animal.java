public class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
    public static class Dog extends Animal {
        @Override
        public void speak() {
            System.out.println("Dog barks");
        }
    }
    public static class Cat extends Animal {
        @Override
        public void speak() {
            System.out.println("Cat meows");
        }
    }
    public static void main(String[] args){
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();   
        d.speak(); 
        c.speak(); 
        a.speak();
    }
}