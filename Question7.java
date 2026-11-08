public class Question7 {
    public static void main(String[] args) {
        System.out.print("Enter customer name: ");
        System.out.print("Enter customer age: ");
        System.out.print("Enter monthly salary: ");
        if (age >= 21) {
            if (salary >= 100000.00) {
                System.out.println(name + ", you qualify for the loan.");
            } else {
                System.out.println(name + ", you do not qualify. Salary is below N100,000.00.");
            } 
        } else {
                System.out.println(name + ", you do not qualify. You must be at least 21 years old.");
        }
    }
}