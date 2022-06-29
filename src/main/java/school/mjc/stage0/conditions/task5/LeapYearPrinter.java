package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        int reminder = 0;

        if (( year % 400 == 0)|| (( year % 4 == 0 ) &&( year % 100 != 0))) {
            reminder = 1;
        }
        switch (reminder) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }

    public static void main(String[] args) {
        isLeapYear(2004);
    }
}
