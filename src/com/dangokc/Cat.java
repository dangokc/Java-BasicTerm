
package com.dangokc;

public class Cat extends Animal{
    
    private boolean _isDeclawed;

    public Cat() {
    }

    public Cat(String name, String breed, boolean isDeclawed) {
        super(name, breed);
        _isDeclawed = isDeclawed;
    }
    
    public String toString() {
        return String.format("Super:%s\t; Sub:isDeclawed: %b\n"
                                , super.toString()
                                , _isDeclawed 
                            );
    }
    
}
