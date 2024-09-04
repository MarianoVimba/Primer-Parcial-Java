import java.util.Objects;

public class Ave extends Animal implements Valoracion{
    private String plumaje;
    private boolean migratorias;

    public Ave(String nombre, String especie, int edad, String estadoDeSalud, String plumaje, boolean migratorias) {
        super(nombre, especie, edad, estadoDeSalud,10 );
        this.plumaje = plumaje;
        this.migratorias = migratorias;
    }

    public Ave() {
        this.plumaje = "";
        this.migratorias = false;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public boolean isMigratorias() {
        return migratorias;
    }

    public void setMigratorias(boolean migratorias) {
        this.migratorias = migratorias;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "plumaje='" + plumaje + '\'' +
                ", migratorias=" + migratorias +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", estadoDeSalud='" + estadoDeSalud + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ave ave = (Ave) o;
        return migratorias == ave.migratorias && Objects.equals(plumaje, ave.plumaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plumaje, migratorias);
    }

    @Override
    public int calcularValoracion() {
        int  valoracion = getValoracion();
        if(getEstadoDeSalud().equalsIgnoreCase("malo"))
        {
            valoracion= (int) valoracion/2;
        }
        if(getEstadoDeSalud().equalsIgnoreCase("estupendo"))
        {
            valoracion=valoracion*2;
        }
        return valoracion;
    }
}
