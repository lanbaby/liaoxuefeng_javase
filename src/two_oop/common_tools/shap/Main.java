package two_oop.common_tools.shap;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rect(200 ,100);
        Shape s2 = new Circle(60);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }

}