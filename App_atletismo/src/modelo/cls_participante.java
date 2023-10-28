
package modelo;
 
    


public class cls_participante {
    private String str_id;
    private String str_nombre;
    private int int_edad;
    private String str_nivel;
    private String str_contacto;
    private int int_estado;
    
    public cls_participante(String id,String nombre,int edad, String nivel, String contacto){
        this.str_nombre = nombre;
        this.str_id = id;
        this.str_contacto = contacto;
        this.str_nivel = nivel;
        this.int_edad = edad;
       
    }

    public String getStr_id() {
        return str_id;
    }


    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public int getInt_edad() {
        return int_edad;
    }

    public void setInt_edad(int int_edad) {
        this.int_edad = int_edad;
    }

    public String getStr_nivel() {
        return str_nivel;
    }

    public void setStr_nivel(String str_nivel) {
        this.str_nivel = str_nivel;
    }

    public String getStr_contacto() {
        return str_contacto;
    }

    public void setStr_contacto(String str_contacto) {
        this.str_contacto = str_contacto;
    }

    public int getInt_estado() {
        return int_estado;
    }

    public void setInt_estado(int int_estado) {
        this.int_estado = int_estado;
    }
    
}
