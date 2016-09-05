/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.testinterface.util;

/**
 *
 * @author Sushant
 */
public abstract class Ball implements Playable,Recycable {

    @Override
    public abstract void play(); 
    
    public abstract void recycle();
}
