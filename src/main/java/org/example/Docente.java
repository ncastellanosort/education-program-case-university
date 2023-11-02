package org.example;

public class Docente extends Persona {
    private String escalafon;

    public Docente(int numId, String tipoId, String nombres, String apellidos, String direccion, String escalafon) {
        super(numId, tipoId, nombres, apellidos, direccion);
        this.escalafon = escalafon;
    }

    @Override
    public String ConsultarInfo() {
        return "\nNumero del id: " + this.numId + "\nTipo del id: " + this.tipoId + "\nNombre: " + this.nombres + "\nApellido: " + this.apellidos + "\nDirección: " + this.direccion + "\n Escalafón: " + this.escalafon;
    }


}
