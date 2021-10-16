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
public class Main {
    public static void main(String[] args) {
        Tea teaHook = new Tea();
        Coffee coffeeHook = new Coffee();
        
        System.out.println("\nMaking tea ...");
        teaHook.prepareRecipe();
        
        System.out.println("\nMaking coffee ...");
        coffeeHook.prepareRecipe();
        
    }
}
