package czarnotalukasz.cwiczeniaRozne.wzorceProjektowe;

public class Singelton {
    private Singelton() {
        //ciało konstruktora
    }
    private static Singelton instance = null;
    public Singelton getInstance() {
        if (instance == null) {
            instance = new Singelton();
        }
        return instance;
    }
}
