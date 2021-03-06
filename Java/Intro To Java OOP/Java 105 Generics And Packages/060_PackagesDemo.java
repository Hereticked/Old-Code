/* The types that are part of the Java platform are members of various packages that bundle classes by function: fundamental classes are in java.lang, classes for reading and writing (input and output) are in java.io, and so on. You can put your types in packages too.

Suppose you write a group of classes that represent graphic objects, such as circles, rectangles, lines, and points. You also write an interface, Draggable, that classes implement if they can be dragged with the mouse. */


    //in the Draggable.java file
    public interface Draggable {
        . . .
    }

    //in the Graphic.java file
    public abstract class Graphic {
        . . .
    }

    //in the Circle.java file
    public class Circle extends Graphic implements Draggable {
        . . .
    }

    //in the Rectangle.java file
    public class Rectangle extends Graphic implements Draggable {
        . . .
    }

    //in the Point.java file
    public class Point extends Graphic implements Draggable {
        . . .
    }

    //in the Line.java file
    public class Line extends Graphic implements Draggable {
        . . .
    }
