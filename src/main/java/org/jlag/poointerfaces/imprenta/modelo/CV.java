package org.jlag.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class CV extends Hoja implements Imprimible{
    private String carrera;
    private Persona persona;
    private List<String> experiencias;

    public CV(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public CV addExperiencias(String ex) {
        experiencias.add(ex);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona)
                .append("\n")
                .append("Resumen: ")
                .append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: ");

        for (String xp : experiencias) {
            sb.append("\n - ").append(xp).append("\n");
        }
        return sb.toString();
    }

}
