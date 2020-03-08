/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator_Carros;

import Clases.Carros;
import java.util.Comparator;

/**
 *
 * @author raul-pc
 */
public class DescAño implements Comparator<Carros>{
    @Override
    public int compare(Carros procedimientoUno, Carros procedimientoDos){
    return Integer.compare(procedimientoUno.getAño(), procedimientoDos.getAño());
    }
    
}
