/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatePattern;

/**
 *
 * @author Mgms
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourIncup();
        
        if(customerWantsCondiments()) {
             addCondiments();  
        }
        addCondiments();
    }
    
    abstract void brew();
    abstract void addCondiments();
    
    void boilWater() {
        System.out.println("Boiling water");
    }
    
    void pourIncup() {
        System.out.println("Pouring into cup");
    }
    
    boolean customerWantsCondiments() {
        return true;
    }
}
