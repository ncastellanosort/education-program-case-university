package org.example;

public class Administrativo extends Persona implements listadoEstudiantes {

    private int salario;
    private boolean verdadero;

    public Administrativo(int numId, String tipoId, String nombres, String apellidos, String direccion, int salario) {
        super(numId, tipoId, nombres, apellidos, direccion);
        this.salario = salario;
    }

    public Administrativo() {
        super(0, " ", " ", " ", " ");
        this.salario = 0;
    }

    @Override
    public String ConsultarInfo() {
        return "\nNumero del id: " + this.numId + "\nTipo del id: " + this.tipoId + "\nNombre: " + this.nombres + "\nApellido: " + this.apellidos + "\nDirección: " + this.direccion + "\n Salario: " + this.salario;
    }

    @Override
    public void mostrarEstudiantes(boolean si) {
        verdadero = true;
        System.out.println("Desea ver el listado de estudiantes: ");
    }

    @Override
    public void noMostrar(boolean no) {
        verdadero = false;
        System.out.println("Debes primero digitar informacion de los estudiantes");
    }
}
