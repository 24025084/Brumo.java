/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bruma.shave.java;

/**
 *
 * @author 24025084
 */

import javax.swing.JOptionPane;

public class BrumaShaveJava {

    public static void main(String[] args) {
        // Burma shave rhyme lines
        String[] rhyme = {
        "shaving brushes",
        "You'll soon see me",
        "on a shelf",
        "in some museum",
        "Bruma shave"
    };
    // display each line in a separate dialog box
    for (String line : rhyme){
        
        JOptionPane.showMessageDialog(null, line);
    
    }
}
}
