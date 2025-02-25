package patient;

import doctor.Doctordetails;

public class Patientdetails {

    String patientId;
    String patientName;

    Patientdetails(String patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;

    }

    void display() {
        System.out.println("patientId" + patientId);
        System.out.println("patientName" + patientName);
    }
}

    class Main {

        public static void main(String[] args) {
            Doctordetails ob1 = new Doctordetails("Suva", "ENT");
            Patientdetails ob2 = new Patientdetails("12s", "Vidisha");
            ob1.show();
            ob2.display();

        }
    }


