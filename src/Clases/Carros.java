/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;
/**
 *
 * @author raul-pc
 */
public class Carros {

    private String placa;
    private String modelo;
    private String año;
    private String color;
    private ArrayList<Mantenimientos> lMantenimientos;
    
    public Carros() {
    }
    
    public Carros(String placa, String modelo, String año, String color, ArrayList<Mantenimientos> lMantenimientos) {
        this.placa = placa;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.lMantenimientos = lMantenimientos;
    }

    //PLACA hecho
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca() {
        Random rnd = new Random();
        int parteUno = 0;
        do {            
            parteUno = rnd.nextInt(999);
        } while (parteUno < 100);
        this.placa = "P" + Integer.toString(rnd.nextInt(1000)) + "-" + Integer.toString(parteUno);
    }

    //MODELO hecho
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo() {
        //LISTA DE MODELOS
        ArrayList<Object> lModelos = new ArrayList<>();
        lModelos.add("AUDI");
        lModelos.add("BENTLEY");
        lModelos.add("BMW");
        lModelos.add("CHREVOLET");
        lModelos.add("CITROEN");
        lModelos.add("DACIA");
        lModelos.add("FORD");
        lModelos.add("FIAT");
        lModelos.add("HYUNDAI");
        lModelos.add("HONDA");
        lModelos.add("INFINITI");
        lModelos.add("KIA");
        lModelos.add("LAND ROVER");
        lModelos.add("LEXUS");
        lModelos.add("NISSAN");
        lModelos.add("PEUGEOT");
        lModelos.add("PORSHE");
        lModelos.add("SUBARU");
        lModelos.add("SUZUKI");
        lModelos.add("TOYOTA");
        //GENERARLOS RANDOM
        Random rnd = new Random();
        int n1 = rnd.nextInt(lModelos.size());
        this.modelo = lModelos.get(n1).toString();
    }

    //AÑOS hecho modificar en futuro
    public String getAño() {
        return año;
    }
    
    public void setAño() {
        Random rnd = new Random();
        GregorianCalendar grego = new GregorianCalendar();
        grego.set(grego.YEAR, 1990 + rnd.nextInt(31));
        this.año = Integer.toString(grego.get(grego.YEAR));
    }

    //COLOR hecho
    public String getColor() {
        return color;
    }
    
    public void setColor() {
        //Lista de colores
        ArrayList<Object> lColor = new ArrayList<>();
        lColor.add("Amarillo");
        lColor.add("Rosa");
        lColor.add("Morado");
        lColor.add("Azul");
        lColor.add("Naranja");
        lColor.add("Verde");
        lColor.add("Blanco");
        lColor.add("Gris");
        lColor.add("Rojo");
        lColor.add("Negro");
        lColor.add("Violeta");
        lColor.add("Cyan");
        lColor.add("Plata");
        lColor.add("Azul Oscuro");
        lColor.add("Verde Oscuro");
        lColor.add("Beige");
        lColor.add("Marrón");
        lColor.add("Kelly");
        //Generador Random
        Random rnd = new Random();
        this.color = lColor.get(rnd.nextInt(lColor.size())).toString();
    }
    //MANTENIMIENTOS, WORKING ON THAT
    public ArrayList<Mantenimientos> getlMantenimientos() {
        return lMantenimientos;
    }
    
    public void setlMantenimientos() {
        this.lMantenimientos = lMantenimientos;
    }
    
}
