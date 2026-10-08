package GrassCoachingClass.Inheritance;

// Multiple Inheritance : Using Interface
interface Torch{

     void provideFlashLight();
}

interface AppStore{

    void downloadApplication();
}

public class Lecture4 implements Torch, AppStore{

   public void provideFlashLight(){
        System.out.println("Mobile use FlashLight");
    }

    public void downloadApplication(){
        System.out.println("Mobile Download Online Application");
    }

    public static void main(String[] args) {

        Lecture4 l = new Lecture4();
        l.provideFlashLight();
        l.downloadApplication();
    }
}
