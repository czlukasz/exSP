package czarnotalukasz.cwiczeniaRozne;

public class ObjectFieldsChanging {
    private int attribute;
    ObjectFieldsChanging(int attribute) {
        this.attribute = attribute;
    }

    public int getAttribute() {
        return this.attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    public static void main(String... args){
        ObjectFieldsChanging ofc1 = new ObjectFieldsChanging(123);
        ObjectFieldsChanging ofc2 = ofc1;

        System.out.println(ofc1.getAttribute());
        System.out.println(ofc2.getAttribute());

        ofc1.setAttribute(1);

        System.out.println(ofc1.getAttribute());
        System.out.println(ofc2.getAttribute());
    }
}
