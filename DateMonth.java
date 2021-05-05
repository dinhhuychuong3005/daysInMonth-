import java.util.Scanner;

public class DateMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon tim so ngay cua thang may");
        int month = sc.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
//                System.out.println("thang 2 co 28 hoac 29 ngay");
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("thang" + month + "co 31 ngay");
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.println("thang" + month + "co 30 ngay");
                daysInMonth = "30";
                break;
            default:
//                System.out.println("nhap lai thang");
                daysInMonth = "";
        }
        if (daysInMonth != ""){
            System.out.println("thang" + month + "co " + daysInMonth + "ngay");
        }
        else {
            System.out.println("nhap lai so thang");
        }
    }
}
