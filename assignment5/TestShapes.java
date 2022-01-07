//FSUID: rah18b
//Class: CGS3416

public class TestShapes {

    public static class Shape {
        private String color;

        public Shape() {
            color = "red";
        }

        public Shape(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void print() {
            System.out.println("Color: " + color);
        }

        public double area() {
            return 0;
        }
    }
    public static class Square extends Shape {
        private double sideLength;

        public Square() {
            super();
            this.sideLength = 1;
        }
        public Square(String color, double sideLength) {
            super(color);
            this.sideLength = sideLength;
        }

        public double getSideLength() {
            return sideLength;
        }

        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public void print() {
            super.print();
            System.out.printf("Side Length: %.0f\nArea: %.0f\n", this.sideLength, area());
        }

        @Override
        public double area() {
            return sideLength * sideLength;
        }
    }
    public static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle() {
            super();
            this.length = 1;
            this.width = 1;
        }

        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        @Override
        public void print() {
            super.print();
            System.out.printf("Length: %.0f\nWidth: %.0f\nArea: %.0f\n", this.length, this.width, area());
        }

        @Override
        public double area() {
            return this.length * this.width;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle() {
            super();
            this.radius = 1;
        }

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public void print() {
            super.print();
            System.out.printf("Radius: %.0f\nArea: %.2f\n", this.radius, area());
        }

        @Override
        public double area() {
            return radius * radius * Math.PI;
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("Green", 12);
        shapes[1] = new Circle("Purple", 3);
        shapes[2] = new Rectangle("Blue", 5, 9);
        int i = 1;
        for(Shape shape : shapes) {
            System.out.println("Shape " + i++ + ":");
            shape.print();
            System.out.println("");
        }
    }

}

