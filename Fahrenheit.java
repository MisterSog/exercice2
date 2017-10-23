/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

import java.util.Scanner;

/**
 *
 * @author gsaintou
 */
public class Fahrenheit {

    public static void main(String[] args) {
        // TODO code application logic here
        String choixS;
        
        String reponseS;
        Scanner sc = new Scanner(System.in);
        ConversionTemp conv = new ConversionTemp();
        char reponse;
        do{
            char choix=' ';
            reponse =' ';
            do{
                 System.out.println("Convertisseur Degrés -> Celsius et Degrés Fahrenheit");
                 System.out.println("Choisissez le mode de conversion :");
                 System.out.println("1 - Convertisseur Celsius -> Fahrenheit");
                 System.out.println("2 - Convertisseur Fahrenheit -> Celsius");
                 
                  choixS = sc.nextLine();
                  if (!choixS.isEmpty())
                        choix = choixS.charAt(0);
            }
            while (choix!= '1' && choix != '2');
             
            if (choix == '1')
             {
                 //Conversion Celsius -> Fahrenheit
                 conv.setTempAConvertir();
                 System.out.println(conv.getTempAConvertir() + "°C correspond à :" + conv.convertirCelsiusFahr() + "°F");
             }
             else
             {
                 //Conversion Fahrenheit -> Celsius
                 conv.setTempAConvertir();
                 System.out.println(conv.getTempAConvertir() + "°F correspond à :" + conv.convertirFahrCelsius() + "°C");
             }
             
             do{
                 System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
                 reponseS = sc.nextLine();
                 if (!reponseS.isEmpty())
                     reponse=reponseS.charAt(0);
             }
             while (reponse!='O' && reponse !='N' && reponse!='o'&& reponse !='n');
      
         }
         while (reponse=='O' || reponse=='o'); 
        System.out.println("Au revoir !");
    }
}
