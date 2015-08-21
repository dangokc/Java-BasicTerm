
package com.dangokc;

public class Dog extends Animal {
    
    private boolean _isServiceAnimal;

    public Dog() {
    }

    public Dog(String name, String breed, boolean isServiceAnimal) {
        super(name, breed);
        _isServiceAnimal = isServiceAnimal;
    }

    public boolean isIsServiceAnimal() {
        return _isServiceAnimal;
    }

    public void setIsServiceAnimal(boolean _isServiceAnimal) {
        this._isServiceAnimal = _isServiceAnimal;
    }
        
    public String toString() {
        return String.format("Super:%s\t; Sub:isServiceAnimal: %b\n"
                                , super.toString()
                                , _isServiceAnimal 
                            );
    }
}
