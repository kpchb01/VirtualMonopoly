/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Util.Cola;
import Util.Lista;
import javax.swing.JFrame;

/**
 *
 * @author Tober
 */
public class Juego {
    JFrame vistaJuego;
    Cola jugadores;
    Lista casillas;
    Lista tarjetas;

    public Juego(JFrame vistaJuego, Cola jugadores, Lista casillas, Lista tarjetas) {
        this.vistaJuego = vistaJuego;
        this.jugadores = jugadores;
        this.casillas = casillas;
        this.tarjetas = tarjetas;
    }
    /*public void  tirarDados() {
        btnVenderCartaCarcel.setEnabled(false);
        if (this.doble == null) {
            memo = (ClassJugador) jugadores.desencolar();
            jugadores.encolar(memo);

        } else {
            memo = this.doble;
        }

        this.seleccion--;
        if (seleccion >= 0) {
            memo.tirarDado();
            if (seleccion == 0) {
                jugadores = Util.ordenarCola(jugadores);
                enviarOrden();
            }
        } else {

            if (memo.getTirosEnCarcelSinPar() == 3) {
                memo.setFueCarcel(false);
                memo.setTirosEnCarcelSinPar(0);
            }

            if (memo.getFueCarcel()) {
                memo.tirarDado();

                if (memo.getPar()) {
                    JPanel panel = (JPanel) casillas.get(memo.getPosicion());
                    panel.setBackground(new java.awt.Color(0, 204, 204));
                    memo.setPosicion(memo.getTiro());
                    JPanel panel1 = (JPanel) casillas.get(memo.getPosicion());
                    panel1.setBackground(memo.getColor());
                    memo.setFueCarcel(false);
                } else {
                    memo.setTirosEnCarcelSinPar(memo.getTirosEnCarcelSinPar() + 1);
                }
            } else {

                this.vistaJuego.memo.avanzar(casillas, this.vistaJuego.memo.tirarDado());
            }

            ValidarCasilla();
            activarBotonVenderCarta();
            actualizarCamposJugador();
            actualizarCamposTarjetaCasilla(memo);
            validarCasillaPropiedad(memo);
            operacionCobrarRenta(memo);
            EntrarSalirCarcel(memo);
            quiebra();
        }
    }*/
}
