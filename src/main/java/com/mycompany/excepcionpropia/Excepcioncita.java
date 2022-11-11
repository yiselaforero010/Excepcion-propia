/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepcionpropia;

import java.io.IOException;

public class Excepcioncita {
    static boolean nombre(double b) throws IOException{
        if (b<10){
            throw new IOException();
        }
        return false;
    } 
}
