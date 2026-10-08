package GrassCoachingClass.Association;

// Basic Association Example
 class Doctor{

     void bodyCheckUp(){
         System.out.println("To check whether all body part working perfectly");
     }
}

class Patient{

     void serviceUse(Doctor doctor){
         doctor.bodyCheckUp();
     }
}

public class Problem1 {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        patient.serviceUse(doctor);
    }
}

/*

What Happened?

s.learn(t);

-: Student is using Teacher's service.

teacher.teach();

-: Student and Teacher are associated.

 */


