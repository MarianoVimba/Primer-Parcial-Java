import java.util.Objects;

public  abstract class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;

    protected String estadoDeSalud;

    protected int valoracion;

    public Animal(String nombre, String especie, int edad, String estadoDeSalud,int valoracion) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.estadoDeSalud = estadoDeSalud;
        this.valoracion=valoracion;
    }

    public Animal() {
        this.nombre = "";
        this.especie = "";
        this.edad = 0;
        this.estadoDeSalud = "";
        this.valoracion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public void setEstadoDeSalud(String estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad && valoracion == animal.valoracion && Objects.equals(nombre, animal.nombre) && Objects.equals(especie, animal.especie) && Objects.equals(estadoDeSalud, animal.estadoDeSalud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, especie, edad, estadoDeSalud, valoracion);
    }
}
