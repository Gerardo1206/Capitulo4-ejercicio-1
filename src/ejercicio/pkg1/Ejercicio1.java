package ejercicio.pkg1;

public class Ejercicio1 {
    public static void main(String[] args) {
        String a="Perez";
        String b="Jose";
        FormLetterWriter carta1 = new FormLetterWriter();
        System.out.println(carta1.doMensaje(a));
        System.out.println(carta1.doMensaje(a, b));
    }
    
}
