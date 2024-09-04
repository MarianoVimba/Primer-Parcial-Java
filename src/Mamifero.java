import java.util.ArrayList;
import java.util.Objects;

public class Mamifero extends Animal implements Valoracion{
    private ArrayList<String>habilidades;
    private String tipoDePelaje;

    public Mamifero(String nombre, String especie, int edad, String estadoDeSalud, String tipoDePelaje) {
        super(nombre, especie, edad, estadoDeSalud,30);
        this.habilidades = new ArrayList<>();
        this.tipoDePelaje = tipoDePelaje;
    }

    public Mamifero() {
        this.habilidades = new ArrayList<>();
        this.tipoDePelaje = "";
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public String getTipoDePelaje() {
        return tipoDePelaje;
    }

    public void setTipoDePelaje(String tipoDePelaje) {
        this.tipoDePelaje = tipoDePelaje;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "habilidades=" + habilidades +
                ", tipoDePelaje='" + tipoDePelaje + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mamifero mamifero = (Mamifero) o;
        return Objects.equals(habilidades, mamifero.habilidades) && Objects.equals(tipoDePelaje, mamifero.tipoDePelaje);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), habilidades, tipoDePelaje);
    }

    public void agregarHabilidad(String habilidad)
    {
        habilidades.add(habilidad);
    }

    @Override
    public int  calcularValoracion() {
        int valoracion = getValoracion();
        if(getEstadoDeSalud().equalsIgnoreCase("regular"))
        {
            valoracion=valoracion*2;
        }
        if(getEstadoDeSalud().equalsIgnoreCase("estupendo"))
        {
            valoracion=valoracion*3;
        }
        return valoracion;
    }
}
