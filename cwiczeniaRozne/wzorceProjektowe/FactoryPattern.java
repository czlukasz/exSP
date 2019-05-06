package czarnotalukasz.cwiczeniaRozne.wzorceProjektowe;

interface Klasa{
    void method1();
    void method2();
}

interface KlasaFactory {
    Klasa GetKlasa();
}

class ImplKlasa1 implements Klasa {
    private ImplKlasa1(){}
    public void method1(){
        System.out.println("ImplKlasa1: method1");
    }
    public void method2(){
        System.out.println("ImplKlasa1: method 2");
    }
    public static KlasaFactory factory = () -> new ImplKlasa1(); //Wyrażenie lambda dla funkcjinału
}

class ImplKlasa2 implements Klasa {
    private ImplKlasa2(){}
    public void method1() {
        System.out.println("ImplKlasa2: method1");
    }
    public void method2() {
        System.out.println("ImplKlasa2: method2");
    }
    public static KlasaFactory factory = ImplKlasa2::new; //wyrażenie "::"
}


public class FactoryPattern {
    public static void klasaConsumer(KlasaFactory fact) {
        Klasa k = fact.GetKlasa();
        k.method1();
        k.method2();
    }

    public static void main(String[] args) {
        klasaConsumer(ImplKlasa1.factory);
        klasaConsumer(ImplKlasa2.factory);
    }
}
