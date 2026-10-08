package JavaProgram;

public class Lecture2 implements Cloneable{
    int jobId;
    String profileName;
    Lecture2(int jobId, String profileName){
        this.jobId = jobId;
        this.profileName = profileName;
    }

    public static void main(String[] args)  throws CloneNotSupportedException{
        Lecture2 l1 = new Lecture2(14215,"Agile");
        Lecture2 l2 = (Lecture2) l1.clone();
        System.out.println(l2.jobId + " " + l2.profileName);

    }
}
