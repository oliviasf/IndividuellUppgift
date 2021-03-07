/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatuppgift;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author olivi
 */
public class AutomatUppgift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Skapar en lokal ArrayList för klassen Mat
       ArrayList<Mat> maten = new ArrayList<>();
       //Fyller ArrayList maten med objekt
       maten.add(new Mat("Pasta", 60, "kyckling och grönsaker"));
       maten.add(new Mat("Sallad", 50, "skinka och ost"));
       maten.add(new Mat("Smörgås", 40, "ost"));
       //Skapar en lokal ArrayList för klassen Dryck
       ArrayList<Dryck> drycken = new ArrayList<>(); 
       //Fyller ArrayList dryck med objekt
       drycken.add (new Dryck("CocaCola", 15, "33 cl"));
       drycken.add (new Dryck("Fanta", 15, "33 cl"));
       drycken.add (new Dryck("Vatten", 10, "50 cl"));
       //Skapar en lokal ArrayList för klassen Kläder
       ArrayList<Kläder> kläderna = new ArrayList<>();
       //Fyller ArrayList kläder med objekt
       kläderna.add (new Kläder("Tröja", 200, "röd, storlek medium"));
       kläderna.add (new Kläder("Byxor", 300, "gröna, storlek small"));
       kläderna.add (new Kläder("Strumpor", 100, "svarta, storlek 40"));
          
       //Hälsningsmeddelande skrivs ut
       System.out.println("VÄLKOMMEN TILL AUTOMATEN");
       System.out.println("------------------------");
       //Skapar en int variabel för huvudmeny
       int val;
       //Do-while loop för att köra huvudmenyn
        do {
            //Meddelande för val i huvudmenyn
            System.out.println("Välj 1 för mat, 2 för dryck, 3 för kläder och 4 för att avsluta");
            //Skapa ett Scanner objekt för att läsa av användarens input
            Scanner scan1 = new Scanner(System.in); 
            //Användarens input sparas i en int variabel
            val = scan1.nextInt();
            //Skapar int variabel för produkt som användaren vill se beskrivning om            
            int köp = 0;
            //Skapar int variabel för produkt som användaren vill köpa
            int köp1 = 0;
            //If-satas för val 1 av huvudmenyn
            if (val == 1){
                    //Skapar int variabel för produktnummer
                    int j = 0;
                    //meddelande för vilka maträtter som finns                                   
                    System.out.println("Följande maträtter finns i automaten:");
                    //Foor-loop för att loopa igenom alla objekt i ArrayList mat i klassen Mat
                    for (Mat i: maten){                       
                      //Ökar variabel för produktnummer varje gång loopen körs
                      j++;
                      //Skriver ut produktnummer samt produktnamn med radbrytning
                      System.out.print(j + ": " + i.name + "\n");
                    }                                                
                    //Meddelande för att välja produktbeskrivning                                                                                  
                    System.out.println("Skriv numret på den vara du vill se beskrivning om");                  
                    //Loopar igenom alla objekt i ArrayList maten
                    for (Mat i: maten){                   
                        //Användarens input sparas i en int variabel              
                        köp = scan1.nextInt();
                        //Hämtar indexpostion i ArrayList. -1 då ArrayList index börjar på 0
                        maten.get(köp-1).Description();
                        //Skriver ut val till användaren för köp eller återgå
                        System.out.println("Välj 1 om du vill köpa och 0 för att återgå:");
                        //Använderns input för köpfråga sparar i en int variabel
                        köp1 = scan1.nextInt();
                            //If-sats för användarens val
                            if (köp1 == 1) {
                                //Anropar metoden Buy i klassen Mat samt hämtar indexposition i ArrayList
                                maten.get(köp-1).Buy(); 
                               break;
                             }
                            else 
                             
                            break;
                        }
                    }  
                                                      
            //If-satas för val 2 av huvudmenyn                              
            else if (val == 2) {
                    //Skapar int variabel för produktnummer
                    int z = 0;
                    //meddelande för vilka drickor som finns  
                     System.out.println("Följande drickor finns i automaten:");
                     //Foor-loop för att loopa igenom alla objekt i ArrayList mat i klassen Dryck
                    for (Dryck i: drycken){  
                        //Ökar variabel för produktnummer varje gång loopen körs
                       z++;
                       //Skriver ut produktnummer samt produktnamn med radbrytning
                      System.out.print(z + ": " + i.name + "\n");
                    }                                                
                    //Meddelande för att välja produktbeskrivning                       
                    System.out.println("Skriv numret på den vara du vill se beskrivning om:");                  
                    //Loopar igenom alla objekt i ArrayList drycken
                    for (Dryck i: drycken){                   
                        //Användarens input sparas i en int variabel              
                        köp = scan1.nextInt();
                        //Hämtar indexpostion i ArrayList. -1 då ArrayList index börjar på 0
                        drycken.get(köp-1).Description();
                        //Skriver ut val till användaren för köp eller återgå
                        System.out.println("Välj 1 om du vill köpa och 0 för att återgå:");
                        //Använderns input för köpfråga sparar i en int variabel
                        köp1 = scan1.nextInt();
                            //If-sats för användarens val
                            if (köp1 == 1) {
                                //Anropar metoden Buy i klassen Dryck samt hämtar indexposition i ArrayList    
                            drycken.get(köp-1).Buy();  
                               break;
                             }
                            else 
                            
                            break;
                        }
                    }
            //If-satas för val 3 av huvudmenyn         
            else if (val == 3){
                    //Skapar int variabel för produktnummer
                    int x = 0;
                    //meddelande för vilka drickor som finns
                     System.out.println("Följande plagg finns i automaten:");
                     //Foor-loop för att loopa igenom alla objekt i ArrayList mat i klassen Kläder
                    for (Kläder i: kläderna){  
                        //Ökar variabel för produktnummer varje gång loopen körs
                      x++;
                      //Skriver ut produktnummer samt produktnamn med radbrytning
                      System.out.print(x + ": " + i.name + "\n");
                    }                                              
                    //Meddelande för att välja produktbeskrivning                       
                    System.out.println("Skriv numret på den vara du vill se beskrivning om:");                  
                    //Loopar igenom alla objekt i ArrayList kläderna
                    for (Kläder i: kläderna){                   
                        //Användarens input sparas i en int variabel              
                        köp = scan1.nextInt();
                        //Hämtar indexpostion i ArrayList. -1 då ArrayList index börjar på 0                                
                        kläderna.get(köp-1).Description();
                        //Skriver ut val till användaren för köp eller återgå
                        System.out.println("Välj 1 om du vill köpa och 0 för att återgå:");
                        //Använderns input för köpfråga sparar i en int variabel
                        köp1 = scan1.nextInt();
                            //If-sats för användarens val
                            if (köp1 == 1) {
                                //Anropar metoden Buy i klassen Kläder samt hämtar indexposition i ArrayList
                            kläderna.get(köp-1).Buy();  
                               break;
                             }
                            else 
                            
                            break;
                         }          }                                         
            
        //villkor för när loopen för huvudmenyn avslutas
        } while (val != 4);
        //Meddelande för att autoamaten avslutas
        System.out.println("Automaten stängs nu av, välkommen åter!");
    }
}          
   
