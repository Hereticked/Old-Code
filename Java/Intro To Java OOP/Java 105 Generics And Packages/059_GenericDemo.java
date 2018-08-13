/**
 * Generic version of the Box class. 
 */
public class Box<T> {

    private T t; // T stands for "Type"          

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}


// "T" in this case stands for type, which means when the program uses Box Class it must
// specify a certain type (like Integer) thereby avoiding runtime bugs when something
// other than an integer is introduced.


public class BoxDemo3 {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        Integer someInteger = integerBox.get(); // no cast!
        System.out.println(someInteger);
    }
}


/* The most commonly used type parameter names are:

    * E - Element (used extensively by the Java Collections Framework)
    * K - Key
    * N - Number
    * T - Type
    * V - Value
    * S,U,V etc. - 2nd, 3rd, 4th types   */