package week2;

/*public class MethodParameter {
    public static void myMethod(double length, double width) {
        double Area = length * width;
        System.out.println("Area is " + Area);
    }
    public static void main(String[] args) {
        myMethod(5,7);
    }
}*/
public class MethodParameter {
    public static void AverageGrade(double grade1, double grade2, double grade3){
        double averageGrade = (grade1 + grade2 + grade3) / 3;
        System.out.println(averageGrade);
    }
    public static void main(String[] args) {
        AverageGrade(30,40,50);
    }
}
