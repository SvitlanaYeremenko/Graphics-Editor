public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.getShapeName();

        Shape triangle = new Triangle();
        triangle.getShapeName();

        Shape rectangle = new Rectangle();
        rectangle.getShapeName();

        Shape square = new Square();
        square.getShapeName();

        Shape parallelogram = new Parallelogram();
        parallelogram.getShapeName();

        Shape rhombus = new Rhombus();
        rhombus.getShapeName();

        NamePrinter namePrinter = new NamePrinter();
        namePrinter.printName(circle);
        namePrinter.printName(triangle);
        namePrinter.printName(rectangle);
        namePrinter.printName(square);
        namePrinter.printName(parallelogram);
        namePrinter.printName(rhombus);
    }
}
