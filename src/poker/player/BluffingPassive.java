/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.player;

import poker.util.Bank;

/**
 *
 * @author Ron.Coleman
 */
public class BluffingPassive extends AbstractPlayer {
    private final static double ALPHA = 0.1;
    private final static double BETA = 0.9;
    
    public BluffingPassive() {
        super(ALPHA, BETA);
    }
}