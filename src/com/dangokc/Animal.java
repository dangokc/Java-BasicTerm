package com.dangokc;


public class Animal {
    
    private String _name;
    private String _breed;
    
    public Animal() {
        //do nothing
    }
    
    public Animal(String name, String breed) {
        _name = name;
        _breed= breed;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getBreed() {
        return _breed;
    }

    public void setBreed(String _breed) {
        this._breed = _breed;
    }
    
    //This method actually @override ToString method
    //Print out Class and name variable
    public String toString() {
        return String.format("Class-%s; Name: %s - Breed: %s\t"
                                , getClass().getName()
                                , getName()
                                , getBreed());
    }
}
