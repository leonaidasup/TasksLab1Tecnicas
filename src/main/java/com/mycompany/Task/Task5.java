/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.puntos;

/**
 *
 * @author leona
 */
public class Task5 {
    public static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }
    public static int task5(int n , int m) {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}
