package semester1.Practice_8_Abbasov_Araz.practice08.homework;

public class Task1GeometryInheritance {
    public static void main(String[] args) {
        System.out.println("================ ГЕОМЕТРІЯ ТІЛ ОБЕРТАННЯ ================");
        System.out.println("Базове коло:");
        Circle circle = new Circle(5.0);
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        Cone cone = new Cone(3.0, 4.0);

        System.out.println(circle);
        System.out.println();
        System.out.println("Циліндр (успадковано від Circle):");
        System.out.println(cylinder);
        System.out.println();
        System.out.println("Конус (успадковано від Circle):");
        System.out.println(cone);
        System.out.println("=========================================================");
    }

    static class Circle {
        private double radius;

        public Circle(double radius) {
            if (radius > 0) {
                this.radius = radius;
            } else {
                System.out.println("Попередження! Радіус не може бути меньше або дорівнювати нулю!");
                this.radius = 1.0;
            }
        }

        public void setRadius(double radius) {
            if (radius > 0) {
                this.radius = radius;
            }
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString() {
            return String.format("Circle[r=%.2f, S=%.2f, C=%.2f]", radius, getArea(), getCircumference());
        }
    }

    static class Cylinder extends Circle {
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            if (height > 0) {
                this.height = height;
            } else {
                System.out.println("Попередження! Висота не може бути менше або дорівнювати нулю!");
                this.height = 1.0;
            }
        }

        public double getVolume() {
            return super.getArea() * height;
        }

        public double getTotalSurfaceArea() {
            return 2 * super.getArea() + super.getCircumference() * height;
        }

        @Override
        public String toString() {
            return String.format("Cylinder[base=%s, h=%.2f, V=%.2f, TotalArea=%.2f]",
                    super.toString(), height, getVolume(), getTotalSurfaceArea());
        }
    }

    static class Cone extends Circle {
        private double height;
        private double lenght;

        public Cone(double radius, double height) {
            super(radius);
            if (height > 0) {
                this.height = height;
            } else {
                System.out.println("Попередження! Висота не може бути менше або дорівнювати нулю!");
                this.height = 1.0;
            }
        }

        public double getSlantHeight() {
            this.lenght = Math.sqrt(getRadius() * getRadius() + height * height);
            return this.lenght;
        }

        public double getVolume() {
            return (double) 1 / 3 * super.getArea() * height;
        }

        public double getTotalSurfaceArea() {
            return super.getArea() + Math.PI * getRadius() * getSlantHeight();
        }

        @Override
        public String toString() {
            return String.format("Cone[base=%s, h=%.2f, l=%.2f, V=%.2f, TotalArea=%.2f]",
                    super.toString(), height, getSlantHeight(), getVolume(), getTotalSurfaceArea());
        }
    }
}