import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creo clase contenedora de animales
        Zoologico zoologico = new Zoologico();

        //creo los distintos de animales
        Mamifero mamifero = new Mamifero("leoncito","leon",10,"regular","pelo");
        Mamifero mamifero1 = new Mamifero("pumita","puma",6,"malo","pelo");
        mamifero1.agregarHabilidad("corre");
        mamifero.agregarHabilidad("caza");
        Ave ave = new Ave("palo","paloma",1,"malo","pelo",true);
        Ave ave1=new Ave();

        Reptil reptil = new Reptil("ser","serpiente",8,"estupendo","escama",true);
        Reptil reptil1=new Reptil();

        //pruebo el funcionamiento de la clase contenedora;
        //los agrego a la clase contenedora
        zoologico.agregar(mamifero);
        zoologico.agregar(mamifero1);
        zoologico.agregar(ave);
        zoologico.agregar(ave1);
        zoologico.agregar(reptil);
        zoologico.agregar(reptil1);

        zoologico.mostrar();

        // buscarPorEspecie
        Animal buscado = zoologico.buscarPorEspecie("puma");
        if(buscado!=null)
        {
            System.out.println("animal encontrado " + buscado.toString());
        }
        else
            System.out.println("el animal buscado no esta");

        // contar
        System.out.println("la cantidad de animales es: " + zoologico.contar());

        //devolver listado
        ArrayList<Animal>animalesEnElzoo = zoologico.devolverListado();
        System.out.println("listado " + animalesEnElzoo);

        //eliminar x nombre
        Animal borado =zoologico.borrarPorNombre("palo");
        if(borado!=null)
        {
            System.out.println("animal borrado " + borado.toString());
        }
        else
            System.out.println("el animal que quiere borrar no esta");

        //muestro con el animal que se borro
        zoologico.mostrar();

        // excursion nueva siendo fin de semana con valoracion 100
        Excursion excursion = new Excursion(true);
        System.out.println("la valoracion de la excursion " + excursion.calcularValoracion());

        // excursion sin ser fin de semana valoracion 50
        Excursion excursion1 = new Excursion(false);
        System.out.println("la valoracion de la excursion " + excursion1.calcularValoracion());

        //valoracion de algunos animales (probando funcionamiento)
        System.out.println("valoracion del mamifero " + mamifero.getNombre() + " " + mamifero.calcularValoracion());
        System.out.println("valoracion del mamifero " + mamifero1.getNombre() + " " +  mamifero1.calcularValoracion());

        System.out.println("valoracion del ave " + ave.getNombre() + " " + mamifero1.calcularValoracion());
        //no muestra el nombre y la valoracion en 0 x el constructor con valores x defecto
        System.out.println("valoracion del ave " + ave1.getNombre() + " " + ave1.calcularValoracion());

        System.out.println("valoracion del reptil " + reptil.getNombre() + " " + reptil.calcularValoracion());





    }
}