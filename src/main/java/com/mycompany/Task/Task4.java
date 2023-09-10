/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;
/**
 *
 * @author leona
 */
public class Task4 {
    public static String money100k(double money) {
        return (int)(money / 100000) + " billetes de 100.000\n" + money50k(money % 100000);
    }
    public static String money50k(double money) {
        return (int)(money / 50000) + " billetes de 50.000\n" + money20k(money % 50000);
    }
    public static String money20k(double money) {
        return (int)(money / 20000) + " billetes de 20.000\n" + money5k(money % 20000);
    }
    public static String money5k(double money) {
        return (int)(money / 5000) + " billetes de 5.000\n" + money2k(money % 5000);
    }
    public static String money2k(double money) {
        return (int)(money / 2000) + " billetes de 2.000\n" + money1k(money % 2000);
    }
    public static String money1k(double money) {
        return (int)(money / 1000) + " billetes de 1.000\n" + money500(money % 1000);
    }
    public static String money500(double money) {
        return (int)(money / 500) + " monedas de 500.\n\nQuedaron " + money % 500 + "dentro de su cuenta.";
    }
    public static void retire(double money) {
        System.out.println(money100k(money));
    }
    public static void main(String[] args) {
        retire(298500);
    }
}
