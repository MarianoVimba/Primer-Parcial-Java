import java.lang.ref.PhantomReference;
import java.util.Objects;

public class Excursion implements Valoracion{
    private int valoracion;
    private boolean esFinDeSemana;

    public Excursion(boolean esFinDeSemana) {
        this.valoracion = 50;
        this.esFinDeSemana = esFinDeSemana;
    }

    public Excursion() {
        this.valoracion=50;
        this.esFinDeSemana =false;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "valoracion=" + valoracion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Excursion excursion = (Excursion) o;
        return valoracion == excursion.valoracion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valoracion);
    }

    @Override
    public int calcularValoracion(){
        int valoracion = getValoracion();

        if(esFinDeSemana)
        {
            valoracion=valoracion*2;
        }
        return valoracion;
    }
}
