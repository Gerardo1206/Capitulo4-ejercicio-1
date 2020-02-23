package ejercicio.pkg1;


public class FormLetterWriter {
    public String doMensaje(String LName){
        String a="Dear Mr. or Ms. "+ LName + " Thank you for your recent order" ;
        return a;
    }
    public String doMensaje(String LName, String name){
        String a="Dear "+ name + " "+  LName+" Thank you for your recent order";
        return a;
    }
    
}
