import java.util.*;

interface tax {
    public void gst(double g);
}

class maintenance {
    int m = 1500;
}

class Hospital extends maintenance implements tax {
    String name;
    int age;
    String gender;
    int phno;
    String address;
    int ICU = 1200;
    double bal = m;
    int z;

    Hospital() {
        System.out.println("Welcome to the Hospital");
    }

    void get_details() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the Customer information");
        System.out.println("Enter Name:");
        name = scr.nextLine();
        System.out.println("Enter Age:");
        age = scr.nextInt();
        System.out.println("Enter Gender:");
        gender = scr.next();
        System.out.println("Enter Phone Number:");
        phno = scr.nextInt();
        System.out.println("Enter Address:");
        address = scr.next();
    }

    void total(int t) {
        bal += t;
    }

    public void gst(double g) {
        g = g / 100 * bal;
        bal += g;
    }

    void discount(double f) {
        z = (int) f;
        f = f / 100 * bal;
        bal -= f;
    }

    void print_details() {
        System.out.println("Getting the Customer information");
        System.out.println("Name : " + name);
        System.out.println("Age :" + age);
        System.out.println("Gender : " + gender);
        System.out.println("Mobile Number:" + phno);
        System.out.println("Address :" + address);
        System.out.println("Total payable bill (incl with GST 5% and Discount " + z + "%) : " + bal);
    }
}

public class HBMS {
    public static void main(String ar[]) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of patients:");
        int n = sc.nextInt();
        Hospital h[] = new Hospital[n];

        for (int i = 0; i < n; i++)
            h[i] = new Hospital();

        for (int i = 0; i < n; i++) {
            h[i].get_details();

            System.out.println("List of diseases:");
            System.out.println("1. Cancer\n2. Skin related\n3. Cardiac disease\n4. Eye related\n5. Tooth related\n6. Bone related\n7. Urinary tract related\n8. Nervous system related\n9. Female reproductive health related\nEnter the Valid Choice: ");
            int a = sc.nextInt();

            switch (a) {
                case 1: h[i].total(80000); break;
                case 2: h[i].total(10000); break;
                case 3: h[i].total(5000); break;
                case 4: h[i].total(2500); break;
                case 5: h[i].total(2000); break;
                case 6: h[i].total(2500); break;
                case 7: h[i].total(3000); break;
                case 8: h[i].total(4000); break;
                case 9: h[i].total(5000); break;
                default: System.out.println("Enter a valid choice"); break;
            }

            System.out.println("Select the Specialist:");
            System.out.println("1. Oncologist\n2. Dermatologist\n3. Cardiologist\n4. Ophthalmologist\n5. Dentist\n6. Orthopedist\n7. Urologist\n8. Neurologist\n9. Gynecologist\nEnter your choice: ");
            int b = sc.nextInt();

            switch (b) {
                case 1:
                case 2: h[i].total(1500); break;
                case 3:
                case 4: h[i].total(1000); break;
                case 5:
                case 6:
                case 7: h[i].total(500); break;
                case 8:
                case 9: h[i].total(2000); break;
                default: System.out.println("Enter a valid choice"); break;
            }

            System.out.println("If you have been admitted to the ICU, type YES or NO:");
            String c = sc.next().toUpperCase();
            if (c.equals("YES")) {
                System.out.println("Enter no.of days :  ");
                int d = sc.nextInt();
                int amu = h[i].ICU * d;
                h[i].total(amu);
            }

            if (h[i].bal >= 5000) {
                System.out.println("Enter the GST percentage:");
                int Gst = sc.nextInt();
                h[i].gst(Gst);

                System.out.println("Enter the discount percentage:");
                int dis = sc.nextInt();
                h[i].discount(dis);
            }

            h[i].print_details();
        }
    }
}
