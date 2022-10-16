class C_Lang {
    void procedural() {
        System.out.println("Its a Procedural Language");
    }
}

public class CppLang extends C_Lang {
    void object_oriented() {
        super.procedural();
        System.out.println("Its a Object Oriented Language");
    }

    public static void main(String[] args) {
        CppLang cpp = new CppLang();
        cpp.object_oriented();
    }
}
