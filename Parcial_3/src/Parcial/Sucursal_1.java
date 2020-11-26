
package Parcial;

import javax.swing.JOptionPane;

public class Sucursal_1 extends Restaurante{
    private String chirrinche;
    public Sucursal_1(String Corriente, String Especial,String Gourmet, String Cocteles, String Jugos_naturales, String chirrinche, String guarapo){
    super (Corriente, Especial, Gourmet, Cocteles, Jugos_naturales);
    this.chirrinche = chirrinche;
    }
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, "El menu de la sucursal 1 son:\n\nPlatos corrientes:"+getCorriente()+"\n\nLos Especiales son:"+getEspecial()+"\n\nLa comidad Gourmet consta de:"+getGourmet()+"\n\nHay cocteles de camaron:"+getCocteles()+"\n\nJugos de:"+getJugos_naturales()+"\n\nY el chirrinche se vende por:"+chirrinche);
        
    }
}
