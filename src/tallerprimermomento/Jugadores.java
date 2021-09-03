
package tallerprimermomento;


public class Jugadores {
    
    //ATRIBUTO
 private int nroCamisa;
 private  String nombre;
 private  String apellidos;
 private  String posicion;
 private int edad;
 private  String equipo;

    public byte getNroCamisa() {
        return nroCamisa;
    }

    public void setNroCamisa(byte nroCamisa) {
        this.nroCamisa = nroCamisa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
         StringBuilder jugador = new StringBuilder();                                                                   
        jugador.append("\nroCamisa: ");
        jugador.append(Camisa);
        jugador.append("\nCombre: ");
        jugador.append(nombre);
        jugador.append("\nApellido: ");
        jugador.append(apellidos);
        jugador.append("\nEdad: ");
        jugador.append(edad); 
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
 
}
