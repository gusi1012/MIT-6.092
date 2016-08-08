public class Payment {

    public void paymentCalc(double basePay, int hoursWorked) {

        if(basePay>8.0) {
            if (hoursWorked <= 40) {
                System.out.println(basePay * hoursWorked);
            } else if ((hoursWorked >= 40) && hoursWorked <= 60) {
                int overtime = hoursWorked - 40;
                System.out.println(basePay * hoursWorked + basePay * overtime * 1.5);
            }else if (hoursWorked>= 60) {
                System.out.println("Error: hours worked is over 60h");
            }
        } else {
            System.out.println("Error: Base pay is under minimum wage!");
        }
    }
}
