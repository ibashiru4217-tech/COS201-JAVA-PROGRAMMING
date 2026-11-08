public class Question5 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        System.out.print("Enter second number: ");
        if (num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else {
            int greater = (num1 > num2) ? num1 : num2;
            System.out.println("The greater number is: " + greater);
        }
    }
}