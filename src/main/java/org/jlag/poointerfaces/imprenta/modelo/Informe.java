package org.jlag.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    protected Persona autor;
    protected Persona revisor;

    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor + " Revisado por: " + this.revisor + "\n " + this.contenido;
    }
}
