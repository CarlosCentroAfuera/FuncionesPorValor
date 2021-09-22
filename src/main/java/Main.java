public class Main {
    public static void main(String[] args) {
        int iDeMain = 0;
        cambiarValorAInt(iDeMain);
        System.out.println(iDeMain);

        MiClase miClaseDeMain = new MiClase();
        cambiarValorAClase(miClaseDeMain);
        System.out.println(miClaseDeMain.i);
    }

    public static void cambiarValorAInt(int iDeFuncion) {
        iDeFuncion++;
    }

    public static void cambiarValorAClase(MiClase miClaseDeFuncion) {
        miClaseDeFuncion.i++;
    }
}
