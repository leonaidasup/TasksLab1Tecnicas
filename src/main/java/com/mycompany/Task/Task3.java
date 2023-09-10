/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puntos;

/**
 *
 * @author leona
 */
public class Task3 {
    private String id;
    private double nh;
    private double bh;
    public Task3(String id, double nh, double bh){
        this.id = id;
        this.nh = nh;
        this.bh = bh;
    }
    public void salary() {
        System.out.println("El trabajador con id: " + this.id + "recibirá una salario de $" + (this.nh * this.bh) * (this.nh > 48? 1.35 : 1));
    }
}
