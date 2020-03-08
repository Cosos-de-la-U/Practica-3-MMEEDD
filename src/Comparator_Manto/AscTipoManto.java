/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator_Manto;

import Clases.Mantos;
import java.util.Comparator;

/**
 *
 * @author raul-pc
 */
public class AscTipoManto implements Comparator<Mantos> {
    @Override
    public int compare(Mantos procedimientoUno, Mantos procedimientoDos) {
        return procedimientoUno.getTipoManto().compareTo(procedimientoDos.getTipoManto());
    }
}
