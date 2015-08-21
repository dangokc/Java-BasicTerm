
public class Animal {
    
    private String _name;
    
    public Animal() {
        //do nothing
    }
    
    public Animal(String name) {
        _name = name;
    }
    
    //This method actually @override ToString method
    //Print out Class and name variable
    public String toString() {
        return String.format("Class-%s; Variable-Name: %s\n"
                                , getClass().getName()
                                , _name);
    }
}
