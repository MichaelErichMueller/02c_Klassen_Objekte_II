package com.cc.java;

public class Cat {
 
   private String name;
   private String furColor;
   private int age;
   private boolean isFemale;

   private int counter;


    public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
}
    public String getStringAttributes(String flag) {
        
        switch (flag) {
            case "#name":
                return name;
                

            case "color":
                return furColor;
                
                
            default:
                return "ERROR";
                
        }
    }
        
    public String getAge() {
            if (!isFemale) {
                return Integer. toString(age);
            } else {
                return checkEscalationLevel();
            }
            
        }
        
    private String checkEscalationLevel(){
    
            
            counter++;
            
            switch (counter) {
                case 1:
                    
                    return"This is not Ok!";
                    case 2:
                    
                    return" Ive told you !";
                    
                    case 3:
                    
                    return"Talk to the Hand";
                
                default:
                    return"1'*?§%";
            }

        }
        
    }



    



    


    

