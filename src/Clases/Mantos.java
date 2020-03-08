/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
/**
 *
 * @author raul-pc
 */
public class Mantos {
    private String tipoManto;
    private double precioManto;
    private Date fechaManto;

    public Mantos() {
    }

    public Mantos(String tipoManto, double precioManto, Date fechaManto) {
        this.tipoManto = tipoManto;
        this.precioManto = precioManto;
        this.fechaManto = fechaManto;
    }

    public String getTipoManto() {
        return tipoManto;
    }

    public void setTipoManto() {
        ArrayList<Object>lTipoMantos = new ArrayList<>();
        lTipoMantos.add("Revisión general");
        lTipoMantos.add("Cambio Ruedas");
        lTipoMantos.add("Manto Motor");
        lTipoMantos.add("Revisión de frenos");
        lTipoMantos.add("Cambio batería");
        lTipoMantos.add("Revisión de aceite");
        lTipoMantos.add("Revisión de filtros");
        lTipoMantos.add("Alineación y balanceo");
        lTipoMantos.add("Cambio de amortiguadores");
        lTipoMantos.add("Revisión de escape y catalizador");
        lTipoMantos.add("Manto de carrocería");
        lTipoMantos.add("Cambio de luces");
        lTipoMantos.add("Manto correctivo");
        lTipoMantos.add("Manto preventivo");
        lTipoMantos.add("Manto predictivo");
        lTipoMantos.add("Afinación");
        lTipoMantos.add("Cambio de pistón y cilindro");
        lTipoMantos.add("Limpieza completa");
        lTipoMantos.add("Reparación de cerraduras");
        lTipoMantos.add("Cambió de ventanas");
        lTipoMantos.add("Revisión de seguro cinturones");
        lTipoMantos.add("Añadir luces halógenas");
        lTipoMantos.add("Reparación del seguro de puertas");
        lTipoMantos.add("Reparación estética");
        Random rnd = new Random();
        this.tipoManto = lTipoMantos.get(rnd.nextInt(lTipoMantos.size())).toString();
    }

    public double getPrecioManto() {
        return precioManto;
    }

    public void setPrecioManto() {
        Random rnd = new Random();
        this.precioManto = 50 + rnd.nextInt(150);
    }

    public Date getFechaManto() {
        return fechaManto;
    }

    public void setFechaManto() {
        //MODIFICAR A SIMPLE EN VEZ DE GREGORIANOS
        GregorianCalendar gc = new GregorianCalendar();
        LocalDate lc = LocalDate.now();
        Random rnd = new Random();
        //Partiendo desde al año y se añade el extra random que se quiere
        int año = 2010 + rnd.nextInt(11);
        gc.set(gc.YEAR, año);
        int mes = rnd.nextInt(12);
        gc.set(gc.MONTH, mes);
        int dia = rnd.nextInt(gc.getActualMaximum(gc.DAY_OF_MONTH));
        gc.set(gc.DATE, dia);
        //Se imprime la fecha de uno en uno porque no se como imprimerlo de un solo
        this.fechaManto = gc.getTime();
    }
    
    
    
}
