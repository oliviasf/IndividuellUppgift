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
//Abstrakt klass för Produkter, innehåller ej egna anstanser och ärvs till ärvda klasser
abstract public class Produkter {
    //Atribut som alla ärvda klasser får
    public String name;
    public int price;
    public String description;

//Skapar konstruktor med samma namn som Klassen och inkluderar parametrar till attributen.
public Produkter(String name, int price, String description){
    this.name = name;
    this.price = price;
    this.description = description;
}
}


