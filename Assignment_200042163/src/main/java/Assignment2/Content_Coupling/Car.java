package Assignment2.Content_Coupling;

/*
    Content coupling occurs when one module can change, access or modify the data of another module.
    When one module directly references another module, access fields of another module, then there occurs
    content coupling. In this case, when one module/class has public fields then another module/class can use
    it or access it directly. One way to solve it is by introducing accessors and mutators(getter and setter)

    In this example, there are two classes car class and carManufacturer class. We can see all the attributes
    of car class are public. In the CarManufacturer class, all the attributes are accessed with using '.'
    followed by class name. Without the use of getter and setter ,therefore, we can see a content coupling
    takes place here.


 */
public class Car {
    public String Manufacturer;
    public int seats;
    public String Car_Number;
    public String Brand;
}
