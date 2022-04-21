package org.pgr112.solutions.sol14.shapes;

public abstract class Shape implements Movable {

    private String color;
    private boolean filled;
    private int id;

    /*
        Let's have only one constructor. We require that all fields are populated through constructor.
        We now have no alternative options when creating a shape object.
     */
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public Shape(){
        this.color = "BLUE";
        this.filled = true;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    /*
        Getter for filled.
        Normally, we name getter methods for boolean values is... , not get...
     */
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
            Look! We have an abstract method. We are hiding implementation details.
            So all subclasses (os Shape) must implement getArea (or be abstract and delegate
            the implementation details to a subclass).
         */
    public abstract double getArea();

    // Another abstract method.
    public abstract double getPerimeter();

    /*
        We override a method from the Object class.
        Remember that all classes inherit from the Object class.
        It is normal to override this method as the method
        inherited from Object provides little information.
     */
    public String toString(){
        if(this.isFilled()) {
            return String.format("A Shape with color of %s and filled.",
                    color.toString());  // Using static method "format" in class String.
        }
        return String.format("A Shape with color of %s and not filled.",
                color.toString());
    }

}