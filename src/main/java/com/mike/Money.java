package com.mike;

public class Money {
    private double value;
    public Money(double value){
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public boolean isGreaterThan(Money m){
        return (this.value > m.value);
    }
    
    public void withdraw(Money m){
        value -= m.value;
    }
}

