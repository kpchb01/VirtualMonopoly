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
        System.out.println("cantidad de jugadores: " + jugadoresList.size());
        jugadores = new Cola();
        for (ClassJugador classJugador : jugadoresList) {
            System.out.println(classJugador.getNombre());
        }
        for (int i = 0; i < jugadoresList.size(); i++) {
            ClassJugador mayor = jugadoresList.get(i);
            for (int j = i; j < jugadoresList.size(); j++) {
               if (jugadoresList.get(j).getTiro() > mayor.getTiro()) {
                    mayor = jugadoresList.get(j);
                    ClassJugador aux = jugadoresList.get(i);
                    jugadoresList.set(i, mayor);
                    jugadoresList.set(j, aux);
                }
            }
            System.out.println("Esta aca: " + mayor.getNombre());
            jugadores.encolar(mayor);
        }
        return jugadores;
    }

    public static ArrayList colaToArrayList(Cola cola) {
        System.out.println("tamaño cola :" + cola.size());
        ArrayList list = new ArrayList();
        Cola aux = new Cola();
        int contador = 0;
        int size = cola.size();
        for (ClassJugador i = (ClassJugador) cola.desencolar(); contador < size; i = (ClassJugador) cola.desencolar()) {
            list.add(i);
            System.out.println("");
            aux.encolar(i);
            contador++;
            System.out.println(i.getNombre());
        }
        contador = 0;
        size = aux.size();
        for (ClassJugador i = (ClassJugador) aux.desencolar(); contador < size;i = (ClassJugador) aux.desencolar()) {
            cola.encolar(i);
            contador++;
        }
        return list;
    }
}
