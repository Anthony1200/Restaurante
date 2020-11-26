package Parcial;
/**
 *
 * @author antho
 */
public class Restaurante {
    private String Corriente, Especial, Gourmet, Cocteles, Jugos_naturales;
    public Restaurante (String Corriente, String Especial,String Gourmet, String Cocteles, String Jugos_naturales){
        this.Corriente = Corriente;
        this.Especial = Especial;
        this.Gourmet = Gourmet;
        this.Cocteles = Cocteles;
        this.Jugos_naturales = Jugos_naturales;
    }

    public String getCorriente() {
        return Corriente;
    }
    public String getEspecial() {
        return Especial;
    }
    public String getGourmet() {
        return Gourmet;
    }
    public String getCocteles() {
        return Cocteles;
    }
    public String getJugos_naturales() {
        return Jugos_naturales;
    }

}
