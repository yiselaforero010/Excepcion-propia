/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.excepcionpropia;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExcepcionPropia {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        JOptionPane.showMessageDialog(null, division((JOptionPane.showInputDialog("digite un numero a")),(JOptionPane.showInputDialog("Digite numero b"))));
        
    }
    public static double division(String a, String div){
        double b=0, c=0, res=0;
        try{
            b=Integer.parseInt(a);
            c=Integer.parseInt(div);
            res = b/c;
            Excepcioncita.nombre(res);
        }catch(IOException ex){
            System.out.println("error, el numero es menor a 10"+ ex.getMessage());
    }
        return res;


    }
}
