package org.example;

public class Persona {
    public int numId;
    public String tipoId;
    public String nombres;
    public String apellidos;
    public String direccion;

    public Persona(int numId, String tipoId, String nombres, String apellidos, String direccion) {
        this.numId = numId;
        this.tipoId = tipoId;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public String ConsultarInfo() {
        return "\nNumero del id: " + this.numId + "\nTipo del id: " + this.tipoId + "\nNombre: " + this.nombres + "\nApellido: " + this.apellidos + "\nDirección: " + this.direccion;
    }
}
