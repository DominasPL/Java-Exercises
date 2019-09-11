package WzorceProjektowe.Singleton;


public class Singleton {

    //Instancję klasy przechowuje się w statycznym (prywatnym lub chronionym) polu klasy, do którego ma dostęp tylko metoda getInstance
    private static Singleton INSTANCE;

    //Aby uniemożliwić utworzenie większej liczby instancji, konstruktor klasy deklaruje się jako prywatny lub chroniony.
    private Singleton() {}

    public static Singleton getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public int address() {
        return System.identityHashCode(INSTANCE);
    }



}
