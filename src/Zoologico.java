import java.util.ArrayList;
import java.util.Objects;

public class Zoologico {
    private ArrayList<Animal>animales;

    public Zoologico() {
        this.animales = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "animales=" + animales +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoologico zoologico = (Zoologico) o;
        return Objects.equals(animales, zoologico.animales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animales);
    }

    //de agregar, buscarPorEspecie, contar, devolverListado y eliminarPorNombre.
    public void agregar(Animal animal)
    {
        animales.add(animal);
    }

    public Animal buscarPorEspecie(String especie)
    {
        Animal animalEncontrado = null;
        int flag = 0;

        for (int i = 0; i < animales.size() && flag==0; i++) {

            if(animales.get(i).getEspecie().equalsIgnoreCase(especie))
            {
                animalEncontrado = animales.get(i);
                flag=1;
            }
        }
        return animalEncontrado;
    }

    public int contar()
    {
        return animales.size();
    }

    public ArrayList<Animal> devolverListado()
    {
        return animales;
    }

    public Animal borrarPorNombre(String nombre)
    {
        int flag = -1;
        Animal animalBorrado = null;

        for (int i = 0; i < animales.size() && flag==-1; i++) {
            String nombreAnimal = animales.get(i).getNombre();
            if(nombreAnimal!=null && nombreAnimal.equalsIgnoreCase(nombre))
            {
                flag = i;
            }
        }
        if(flag!=-1)
        {
            animalBorrado = animales.get(flag);
            animales.remove(flag);
        }
        return animalBorrado;
    }

    public void mostrar()
    {
        for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i).toString());
        }
    }
}
