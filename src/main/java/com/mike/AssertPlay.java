package com.mike;

class Setup{
    int a = 22;
    
    void someOperation(){
        a++;
        assert a < 20 : "test";
    }

}

public class AssertPlay{
    public static void main(String[] args){
        assert 33 < 20 : "Not less than 20";        
        Setup setup = new Setup();
        setup.someOperation();

    }
    
}