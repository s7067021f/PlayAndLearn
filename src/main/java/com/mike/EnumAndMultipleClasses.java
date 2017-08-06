package com.mike;

enum UserStatus { // basic enum
    PENDING,
    ACTIVE,
    INACTIVE,
    DELETED
}

enum WhoIsRIR { //enum and instance (or variable) field
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net");
    
    // the enum values are ARIN and RIPE
    // each value uses the constructor below to set the variable url
    // so the enum has a value e.g. ARIN and a "url" attribute
    
    private String url;
    
    WhoIsRIR (String url){
        this.url = url;
    }
    
    public String url() {
        return url;
    }
}

enum Operation { // enum and method ie logic
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;
    
    double calculate(double a, double b){
        switch(this) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                throw new AssertionError("Unknown operation "+ this);
        }
    }
}

public class EnumAndMultipleClasses {
    public static void main(String[] arg){
        System.out.println(UserStatus.PENDING);
        
        System.out.println(WhoIsRIR.ARIN.url());

        double result = Operation.ADD.calculate(1,2);
        System.out.println(result);
        
        //to loop thru the values in an enum
        for (UserStatus status : UserStatus.values()){
            System.out.print(status + "; ");
        }
        System.out.println();
        
        //to compare enum values
        WhoIsRIR who = WhoIsRIR.RIPE;
        System.out.println("Printing out the WhoIsRIR enum who: "+who);
        System.out.println("Printing our the WhoIsRIR enum who's url attribute: " + who.url());
        if (who == WhoIsRIR.RIPE){
            System.out.println("Match on comparing enum values");
        }
        
        //switch case
        WhoIsRIR who2 = WhoIsRIR.ARIN;
        switch (who2){
            case ARIN:
                System.out.println("Arin");
                break;
            case RIPE:
                System.out.println("Ripe");
                break;
            default:
                System.out.println("Default");
        }
    }
    
}
