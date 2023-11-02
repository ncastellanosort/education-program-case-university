package org.example;

public class Estudiante extends Persona {

    private String codigo;
    private boolean pagado;

    public Estudiante(int numId, String tipoId, String nombres, String apellidos, String direccion, String codigo) {
        super(numId, tipoId, nombres, apellidos, direccion);
        this.codigo = codigo;
        this.pagado = false;
    }

    @Override
    public String ConsultarInfo() {
        return "\nNumero del id: " + this.numId + "\nTipo del id: " + this.tipoId + "\nNombre: " + this.nombres + "\nApellido: " + this.apellidos + "\nDirección: " + this.direccion + "\n Código: " + this.codigo;
    }
    
    @Override
    public String toString() {
        return "\nNumero del id: " + numId + "\nTipo del id: " + tipoId + "\nNombre: " + nombres + "\nApellido: " + apellidos + "\nDirección: " + direccion + "\n Código: " + codigo;
    }
}
class Matriculado implements Matricula {
    
    private boolean pagado;

    @Override
    public void siPago(boolean si) {
        pagado = true;
        System.out.println("El estudiante esta matriculado");
    }

    @Override
    public void noPago(boolean no) {
        pagado = false;
        System.out.println("El estudiante no esta matriculado");
    }

}
