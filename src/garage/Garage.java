/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

/**
 *
 * @author davs
 */
public class Garage {
    private String name;
    private int cars;
    
    public Garage(String gname){
        name = gname;
        cars = 0;
    }
    
    public int getCars(){
        return cars;
    }
    
    public void setCars(int amount){
        cars = amount;
    }
    
    public void addCars(int amount){
        cars = cars + amount;
    }
    
    @Override
    public String toString(){
        return name + " antal ("+cars+")";
    }
    
}
