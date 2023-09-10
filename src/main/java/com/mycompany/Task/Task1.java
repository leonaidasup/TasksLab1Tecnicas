/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task;

/**
 *
 * @author leona
 */
public class Task1 {
    public static int task1(int a, int b) {
        return a == 0 ? 0 : 2 * a - 1 + b + task1(a - 1, b); // a ** 2
    }
}
