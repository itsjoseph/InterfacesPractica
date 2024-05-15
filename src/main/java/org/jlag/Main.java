package org.jlag;

import org.jlag.poointerfaces.imprenta.modelo.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CV curriculum = new CV(new Persona("Luis", "cv"), "Sistemas", "Resumen laboral-----");
        curriculum.addExperiencias("java")
                .addExperiencias("Oracle 12c")
                .addExperiencias("Angular");

        Informe informe = new Informe("Estudio de microservicios", new Persona("Luis autor", "revisor"), new Persona("Luis revisor", "luis revisor"));
        imprimir(curriculum);
        imprimir(informe);

        Libro libro = new Libro(new Persona("Luis autor", "Amador"), "Patrones de diseño", Genero.PROGRAMACION);
        libro.add(new Pagina("Patron singgleton"))
                .add(new Pagina("Patron Observer"))
                .add(new Pagina("Patron factory"))
                .add(new Pagina("Compositor"))
                .add(new Pagina("Facade"));

        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());

    }
}