/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Clases.ClassJugador;
import java.util.ArrayList;

/**
 *
 * @author Tober
 */
public class Util {

    public static Cola ordenarCola(Cola jugadores) {
        ArrayList<ClassJugador> jugadoresList = Util.colaToArrayList(jugadores);
        jugadores = null;
        jugadoresList.stream().map((i) -> i).forEachOrdered((mayor) -> {
            for (ClassJugador j : jugadoresList) {
                if (j.getTiro() > mayor.getTiro()) {
                    mayor = j;
                }
            }
        });

        return jugadores;
    }

    public static ArrayList colaToArrayList(Cola cola) {
        ArrayList list = new ArrayList();
        for (ClassJugador i = (ClassJugador) cola.desencolar(); i != null; cola.desencolar()) {
            list.add(i);
            cola.encolar(i);
        }
        return list;
    }
}
