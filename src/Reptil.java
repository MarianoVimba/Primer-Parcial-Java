import java.util.Objects;

public class Reptil extends Animal implements Valoracion{
    private String tipoDeEscama;
    private boolean venenoso;

    public Reptil(String nombre, String especie, int edad, String estadoDeSalud, String tipoDeEscama, boolean venenoso) {
        super(nombre, especie, edad, estadoDeSalud, 25);
        this.tipoDeEscama = tipoDeEscama;
        this.venenoso = venenoso;
    }

    public Reptil() {
        this.tipoDeEscama = "";
        this.venenoso = false;
    }

    public String getTipoDeEscama() {
        return tipoDeEscama;
    }

    public void setTipoDeEscama(String tipoDeEscama) {
        this.tipoDeEscama = tipoDeEscama;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Reptil reptil = (Reptil) o;
        return venenoso == reptil.venenoso && Objects.equals(tipoDeEscama, reptil.tipoDeEscama);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoDeEscama, venenoso);
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "tipoDeEscama='" + tipoDeEscama + '\'' +
                ", venenoso=" + venenoso +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }

    @Override
    public int calcularValoracion() {
        int valoracion = getValoracion();

        if(getEstadoDeSalud().equalsIgnoreCase("estupendo"))
        {
            valoracion=valoracion*3;
        }
        return valoracion;
    }
}
