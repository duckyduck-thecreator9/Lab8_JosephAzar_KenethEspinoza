/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;
import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author joseph
 */
public class Mago extends Jugador implements Serializable{
    
    //private static final long SerialVersionUID = 343L;
    Random r = new Random();
    private int ac = 20;
    private int cs = 0;
    private int dg = 5 + r.nextInt(5);
    private String magia;
    private String Habilidad;

    public Mago(String nombre, String nacionalidad, String raza, String tipo, String descripcion, double estatura, int anos, double peso, int hp, String magia, String Habilidad) {
        super(nombre, nacionalidad, raza, tipo, descripcion, estatura, anos, peso, hp);
    }

    public String getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(String Habilidad) {
        this.Habilidad = Habilidad;
    }
    
    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getDg() {
        return dg;
    }

    public void setDg(int dg) {
        this.dg = dg;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public void print() {
        System.out.println("ac: " + ac + " cs: : " + cs + " dg: " + dg + " Magia: " + magia + " Habilidad: " + Habilidad);
    }
}
