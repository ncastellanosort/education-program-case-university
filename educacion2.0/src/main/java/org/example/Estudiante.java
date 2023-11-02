package org.example;

public class Estudiante extends Persona implements Matricula {


    private String codigo;
    private boolean pagado;

    public Estudiante(int numId, String tipoId, String nombres, String apellidos, String direccion, String codigo) {
        super(numId, tipoId, nombres, apellidos, direccion);
        this.codigo = codigo;
    }

    public Estudiante() {
        super(0, " ", " ", "", "");
        this.codigo = " ";
    }

    @Override
    public String ConsultarInfo() {
        return "\nNumero del id: " + this.numId + "\nTipo del id: " + this.tipoId + "\nNombre: " + this.nombres + "\nApellido: " + this.apellidos + "\nDirección: " + this.direccion + "\n Código: " + this.codigo;
    }

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
