/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("y")) {
            return true;
        }
        else {
            return false;
        }
    }
    
    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch(IOException ioe) {
            System.err.println("IO Error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
    
}
