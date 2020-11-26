package Parcial;

import javax.swing.JOptionPane;

public class Sucursal_2 extends Restaurante{
    
    
    private String comidas_rapidas;
    public Sucursal_2(String Corriente, String Especial, String Gourmet, String Cocteles, String Jugos_naturales, String comidas_rapidas) {
        super(Corriente, Especial, Gourmet, Cocteles, Jugos_naturales);
        this.comidas_rapidas = comidas_rapidas;
    }
    public void mostrardatos(){
        JOptionPane.showMessageDialog(null, "El menu de la sucursal 2 es:\n\nPlatos corrientes:"+getCorriente()+"\n\nLos Especiales son:"+getEspecial()+"\n\nLa comidad Gourmet consta de:"+getGourmet()+"\n\nHay cocteles de camaron:"+getCocteles()+"\n\nJugos de:"+getJugos_naturales()+"\n\nLas comidas rapidas son:"+comidas_rapidas);
    }
}