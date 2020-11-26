package Parcial;
/**
 *
 * @author antho
 */
public class Main {
    public static void main(String[] args){
        Sucursal_1 primero = new Sucursal_1("\nBandeja paisa\nArroz con huevo\nFrijoles con kumis", "\nPaella\nRatatouille\nFilet Mignon", "\nSopa fria de melón a la menta\nBogabate con lechuga de mar", "\nGrande\nMediano\nPequeño", "\nMora\nArandano\nMango", "\nlitros\n1 Litro\n1/2 litro", null);
        primero.MostrarDatos();
        Sucursal_2 segundo = new Sucursal_2("\nTamal \nArroz con frijo\ncarne con papa", "\nArroz con camaron\nCazuela de mariscos\nFilete de robalo", "\nSopa fria de melón a la menta\nBogabate con lechuga de mar", "\nA la mexicana\nSin picante\nCon frutos", "\nFreijoba\nBorojo\nLulo", "\nPapas francesas\nHamburgesa\nPerro caliente");
        segundo.mostrardatos();
    }
}
