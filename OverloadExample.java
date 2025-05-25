public class OverloadExample {

    
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }.java
	
    
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b, double c) {
        return max(max(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println("Max of 3 and 5: " + max(3, 5));
        System.out.println("Max of 3.5 and 5.5: " + max(3.5, 5.5));
        System.out.println("Max of 1.1, 2.2, 3.3: " + max(1.1, 2.2, 3.3));
    }
}