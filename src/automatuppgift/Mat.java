/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatuppgift;



/**
 *
 * @author olivi
 */
//Klass Mat som ärver från Produkter och implementerar interface från Interface
public class Mat extends Produkter implements Interface{
    
    
    //Konstrtuktor tar in parametrar för Produkter-attribut samt sitt eget attribut.
    public Mat (String name, int price, String description){
        //Använder Super för att kontakta Konstruktorn av abstrakta Produkter klassen
            super (name, price, description);
    }
    
    //Metod som implementerats ifrån interface Interface
    @Override
    //Metod för att skriva ut beskrivning
    public void Description() {
        System.out.println(this.name + " med " + this.description);
        System.out.println("Pris: " + this.price);           
        }    
    //Metod som implementerats ifrån interface Interface    
    @Override
    //Metod för att bekräfta att köpet är genomfört, anropar metoden Use() innuti metoden
    public void Buy() {       
        System.out.println("Du har nu köpt en " + this.name);
        Use();     
            }
    //Metod som implementerats ifrån interface Interface
    @Override
    //Metod för att skriva ut hälsning, anropas från ovan metod
    public void Use() {
        System.out.println("Smaklig måltid!");    }

   
    
    
}
