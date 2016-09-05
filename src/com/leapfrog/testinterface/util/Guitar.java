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
public class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Play guitar");
    }
    
}
