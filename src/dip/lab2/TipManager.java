/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Timothy
 */
public class TipManager {

    private CalculatorStrategy strategy;

    public TipManager(CalculatorStrategy cs) {
        this.strategy = cs;
    }

    public double getTip() {
        return strategy.getTip();
    }
    
}
