/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gsaintou
 */
public class ConversionTemp {
    
    private double temp;
    
    public double convertirCelsiusFahr()
    {
        return arrondi((9*this.temp)/5 + 32,2);
    }
    public double convertirFahrCelsius()
    {
        return arrondi((this.temp-32)*5/9,2);
    }
    
    public void setTempAConvertir()
    {
        Scanner sc = new Scanner(System.in);
        // permet de saisir des chiffres avec le point au lieu de la virgule (version américaine);
        sc.useLocale(Locale.US); 
        System.out.println("Température à convertir :");
        
        this.temp = sc.nextDouble();  
        sc.nextLine();
        
        
    }
    
    public double getTempAConvertir()
    {
        return this.temp;
    }
    
    public static double arrondi(double A, int B) 
    {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
