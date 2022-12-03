/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author joseph
 */
public class Jugar2 implements Runnable {

    private JButton atack1, atack2, defend1, defend2;
    private JLabel j1, j2, enmedio, clase1, tipo1, ac1, hp1, cs1, clase2, tipo2, ac2, hp2, cs2;
    private Barbaro jugador1;
    private Mago jugador2;

    public Jugar2(JButton atack1, JButton atack2, JButton defend1, JButton defend2, JLabel j1, JLabel j2, JLabel enmedio, JLabel clase1, JLabel tipo1, JLabel ac1, JLabel hp1, JLabel cs1, JLabel clase2, JLabel tipo2, JLabel ac2, JLabel hp2, JLabel cs2, Barbaro jugador1, Mago jugador2) {
        this.atack1 = atack1;
        this.atack2 = atack2;
        this.defend1 = defend1;
        this.defend2 = defend2;
        this.j1 = j1;
        this.j2 = j2;
        this.enmedio = enmedio;
        this.clase1 = clase1;
        this.tipo1 = tipo1;
        this.ac1 = ac1;
        this.hp1 = hp1;
        this.cs1 = cs1;
        this.clase2 = clase2;
        this.tipo2 = tipo2;
        this.ac2 = ac2;
        this.hp2 = hp2;
        this.cs2 = cs2;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Barbaro jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Mago jugador2) {
        this.jugador2 = jugador2;
    }
    
    public JLabel getJ1() {
        return j1;
    }

    public void setJ1(JLabel j1) {
        this.j1 = j1;
    }

    public JLabel getJ2() {
        return j2;
    }

    public void setJ2(JLabel j2) {
        this.j2 = j2;
    }

    public JLabel getEnmedio() {
        return enmedio;
    }

    public void setEnmedio(JLabel enmedio) {
        this.enmedio = enmedio;
    }

    public JLabel getClase1() {
        return clase1;
    }

    public void setClase1(JLabel clase1) {
        this.clase1 = clase1;
    }

    public JLabel getTipo1() {
        return tipo1;
    }

    public void setTipo1(JLabel tipo1) {
        this.tipo1 = tipo1;
    }

    public JLabel getAc1() {
        return ac1;
    }

    public void setAc1(JLabel ac1) {
        this.ac1 = ac1;
    }

    public JLabel getHp1() {
        return hp1;
    }

    public void setHp1(JLabel hp1) {
        this.hp1 = hp1;
    }

    public JLabel getCs1() {
        return cs1;
    }

    public void setCs1(JLabel cs1) {
        this.cs1 = cs1;
    }

    public JLabel getClase2() {
        return clase2;
    }

    public void setClase2(JLabel clase2) {
        this.clase2 = clase2;
    }

    public JLabel getTipo2() {
        return tipo2;
    }

    public void setTipo2(JLabel tipo2) {
        this.tipo2 = tipo2;
    }

    public JLabel getAc2() {
        return ac2;
    }

    public void setAc2(JLabel ac2) {
        this.ac2 = ac2;
    }

    public JLabel getHp2() {
        return hp2;
    }

    public void setHp2(JLabel hp2) {
        this.hp2 = hp2;
    }

    public JLabel getCs2() {
        return cs2;
    }

    public void setCs2(JLabel cs2) {
        this.cs2 = cs2;
    }

    
    
    public JButton getAtack1() {
        return atack1;
    }

    public void setAtack1(JButton atack1) {
        this.atack1 = atack1;
    }

    public JButton getAtack2() {
        return atack2;
    }

    public void setAtack2(JButton atack2) {
        this.atack2 = atack2;
    }

    public JButton getDefend1() {
        return defend1;
    }

    public void setDefend1(JButton defend1) {
        this.defend1 = defend1;
    }

    public JButton getDefend2() {
        return defend2;
    }

    public void setDefend2(JButton defend2) {
        this.defend2 = defend2;
    }

    public JButton getAtack() {
        return atack1;
    }

    public void setAtack(JButton atack) {
        this.atack1 = atack;
    }
    
    
    @Override
    public void run() {
        System.out.println(jugador1.getAbilidad());
        j1.setText(jugador1.getNombre());
        j2.setText(jugador2.getNombre());
        enmedio.setText(jugador1.getNombre());
        clase1.setText(jugador1.getAbilidad());
        tipo1.setText(jugador1.getTipo());
        ac1.setText( jugador1.getAc() + "" );
        hp1.setText( jugador1.getHp() + "" );
        cs1.setText(jugador1.getCs() + "" );
        
        clase2.setText(jugador2.getHabilidad());
        tipo2.setText(jugador2.getTipo());
        ac2.setText( jugador2.getAc() + "" );
        hp2.setText( jugador2.getHp() + "" );
        cs2.setText(jugador2.getCs() + "" );
        
        atack1.disable();
        defend1.disable();
        
        
    }
}
