/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almanaque;

import java.util.ArrayList;

/**
 *
 * @author geral
 */
public class Almanaque {
    private static ArrayList<Canton> cantones;

    public Almanaque() {
    }

    public static ArrayList<Canton> getCantones() {
        return cantones;
    }

    public static void setCantones(ArrayList<Canton> cantones) {
        Almanaque.cantones = cantones;
    }  
}
