/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author sanja
 */
public class GameNumber {
    @SuppressWarnings("FieldMayBeFinal")
    private int gamenumber;
    
   public GameNumber(){
        this.gamenumber = 1;
    }

    /**
     *
     * @param value
     */
    public GameNumber(int value){
        this.gamenumber = value;
    }
    public void setRandom(int min, int max){
        Random random = new Random();
        this.setGamenumber(random.nextInt(max-min) + min);
        
    }

    /**
     * @return the gamenumber
     */
    public int getGamenumber() {
        return gamenumber;
    }

    /**
     * @param gamenumber the gamenumber to set
     */
    public void setGamenumber(int gamenumber) {
        if (gamenumber < 0){
           this.gamenumber = 0; 
        }
        else {
        this.gamenumber = gamenumber;
        }
    }
    public void increment(){
        gamenumber++;
    }
    
}
