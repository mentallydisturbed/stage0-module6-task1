package com.epam.mjc.stage0;

public class Bird extends Animal{
    Bird() {
        super("blue", 2, false);
    }
    @Override
    String getDescription(){
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
//
//    public static void main(String[] args) {
//        System.out.println(new Bird().getDescription());
//        System.out.println(new Dog().getDescription());
//        System.out.println(new Animal("bb", 1, true).getDescription());
//    }
}
