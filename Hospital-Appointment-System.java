import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to My Hospital!!");
        System.out.println("Dear Sir/Madam, please Enter your Details");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age <= 18) {
            System.out.println("The hospital is only for people above 18 years of age.");
            return;
        }
        if (age >95) {
            System.out.println("Please enter your correct age.");
            return;
        }

        System.out.println("Please Select your Gender:");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Prefer Not To Say");
        int gender = sc.nextInt();

        if (gender == 1) {
            System.out.println("Your Gender is Male");
        } else if (gender == 2) {
            System.out.println("Your Gender is Female");
        } else if (gender == 3) {
            System.out.println(" your Gender is Prefer Not To Say");
        } else {
            System.out.println("Invalid gender selection.");
            return;
        }

        sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        System.out.print("Enter your mobile number: ");
        String input = sc.nextLine();
        
        if (input.length() == 10 && input.matches("[0-9]+")) {
            //System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid phone number");
            return;
        }
        System.out.println("Please select the reason for attending the hospital:");
        System.out.println("1. Fever");
        System.out.println("2. Viral Infections");
        System.out.println("3. Bacterial Infections");
        System.out.println("4. Parasitic Infections");
        System.out.println("5. Cardiovascular Diseases");
        System.out.println("6. Respiratory Diseases");
        System.out.println("7. Diabetes and Related Conditions");
        System.out.println("8. Cancer");
        System.out.println("9. Accidents and Injuries");
        System.out.println("10. Acute Infections");
        System.out.println("11. Organ Failures");

        int reason = sc.nextInt();

        if (reason < 1 || reason > 11) {
            System.out.println(" Please select a valid reason.");
            return;
        }

        switch (reason) {
            case 1:
                System.out.println("You selected Fever.");
                break;
            case 2:
                System.out.println("You selected Viral Infections.");
                break;
            case 3:
                System.out.println("You selected Bacterial Infections.");
                break;
            case 4:
                System.out.println("You selected Parasitic Infections.");
                break;
            case 5:
                System.out.println("You selected Cardiovascular Diseases.");
                break;
            case 6:
                System.out.println("You selected Respiratory Diseases.");
                break;
            case 7:
                System.out.println("You selected Diabetes and Related Conditions.");
                break;
            case 8:
                System.out.println("You selected Cancer.");
                break;
            case 9:
                System.out.println("You selected Accidents and Injuries.");
                break;
            case 10:
                System.out.println("You selected Acute Infections.");
                break;
            case 11:
                System.out.println("You selected Organ Failures.");
                break;
            default:
                System.out.println("Unknown reason.");
                break;
        }
        System.out.println("please select !since how many days you are suffering with this problem");
        System.out.println("1.today");
        System.out.println("2.more than one day");
        System.out.println("3.more than 5 days");
        int problem=sc.nextInt();
        if (problem==1) {
            System.out.println("consult to the doctor");
        }
        if (problem==2) {
            System.out.println("consult to the doctor");
        }
        if (problem==3) {
            System.out.println("ohh! please come fast to hospital and consult to the doctor");
        }
        if (problem>3) {
            System.out.println("Choose correct option");
            return;
        }
        if (reason==1) {
            System.out.println("DR.M.RAVI KUMAR(MBBS,MD) ROOM NO:901");
            
        }
        if (reason==2) {
            System.out.println("DR.K.MANOJ REDDY(MBBS,PD) ROOM N0:902");
        }
        if (reason==3) {
            System.out.println("DR.L.RAJU MANOHAR(ZPL,MND) ROOM NO:903");
        }
        if (reason==4) {
            System.out.println("DR.G.RAJI REDDY(MBBS,KFD) ROOM NO:904");
        }
        if (reason==5) {
            System.out.println("DR.R.SUHAS(MBBS,PHB) ROOM NO:905");
        }
        if (reason==6) {
            System.out.println("DR.N.DEVENDER REDDY(MBBS,CARDIO) ROOM NO:906");
        }
        if (reason==7) {
            System.out.println("DR.M.SUNIL REDDY(MBBS,FFS) ROOM NO:907");
        }
        if (reason==8) {
            System.out.println("DR.J.SINGH(MBBS,FRCS) ROOM NO:908");
        }
        if (reason==9) {
            System.out.println("DR.D.MAHESH(MBBS,FRCS) ROOM NO:909 ");
        }
        if (reason==10) {
            System.out.println("DR.A.SHIVA PRASAD(FRCS,NURO) ROOM NO:9010");
        }
        if (reason==11) {
            System.out.println("DR.CH.SRAVANI(MBBS,NURO) ROOM NO:9011");
        }
        if (reason>11) {
            System.out.println("Invalid !!");
        }
        System.out.println("Doctor Timings are:");
        System.out.println("1.MONDAY(09:30 AM TO (02:00 PM)");
        System.out.println("2.TUESDAY(09:30 AM TO (02:00 PM)");
        System.out.println("3.WEDNESDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        System.out.println("4.THRUSDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        System.out.println("5.FRIDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        System.out.println("6.SATURDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        System.out.println("Please select the timeings for appointment");
        int day=sc.nextInt();
        if (day==1) {
            System.out.println("1.MONDAY(09:30 AM TO (02:00 PM)");
        } 
        if(day==2) {
            System.out.println("2.TUESDAY(09:30 AM TO (02:00 PM)");
        }
        if (day==3) {
            System.out.println("3.WEDNESDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        }
        if (day==4) {
             System.out.println("4.THRUSDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        }
        if (day==5) {
            System.out.println("5.FRIDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        }
        if (day==6) {
            System.out.println("6.SATURDAY(09:30 AM TO (11:00 AM) AND (02:00 PM ) TO (06:30 PM)");
        }
        if (day>6) {
            System.out.println("Invalid!!");
        }
        System.out.println("Your appointment was confirmed!! all the details will be shared with you via sms");
        System.out.println("Please pay the appointment fee and collect your report from the doctor");
        System.out.println("THANK YOU!!!");

        sc.close();
    }
}
