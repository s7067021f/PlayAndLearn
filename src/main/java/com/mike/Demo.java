package com.mike;

import java.util.ArrayList;

interface Payable{
    void pay();
    public static class Implementation implements Payable{
        public void pay() {
            System.out.println("pay from Implementation");
        }
    }    
}

class Employee extends Payable.Implementation { //so Employee inherits the super class pay() method code
} //bit dirty, don't like extending like this (or extending anyway)

class Contractor implements Payable {
    private Payable delegate = new Payable.Implementation(); //so Contractor HAS-A Payable.Implementation
    public void pay() {
        delegate.pay();
    }
}

//lets try the Strategy pattern

class Implementation2 implements Payable{
    public void pay() {
        System.out.println("pay from Implementation2 for Strategy pattern");
    }
}

class Consultant {
    private Payable strategy = new Implementation2(); //HAS-A
    public void executeStrategy(){
        strategy.pay();
    }
}

//i prefer the Strategy pattern!

public class Demo {
    public static void main(String[] args){
        Consultant consultant = new Consultant();
        consultant.executeStrategy();
        Employee employee = new Employee();
        employee.pay();
        Contractor contractor = new Contractor();
        contractor.pay();
        
        ArrayList<Song> alSongs = new ArrayList<Song>();
        Song a = new Song("Title of song", "Artist of song", "Rating of song");
        alSongs.add(a);
        System.out.println(a.toString());
    }
}
