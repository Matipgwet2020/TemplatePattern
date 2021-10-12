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
public class Coffee extends CaffeineBeverage {
    
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }
    
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    
}
