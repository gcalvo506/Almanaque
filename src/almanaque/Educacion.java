/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almanaque;

/**
 *
 * @author geral
 */
public class Educacion {
    private String alfabetismo;
    private String escolaridad;
    private String asistenciaEducacionRegular;

    public Educacion() {
    }

    public Educacion(String alfabetismo, String escolaridad, String asistenciaEducacionRegular) {
        this.alfabetismo = alfabetismo;
        this.escolaridad = escolaridad;
        this.asistenciaEducacionRegular = asistenciaEducacionRegular;
    }

    public String getAlfabetismo() {
        return alfabetismo;
    }

    public void setAlfabetismo(String alfabetismo) {
        this.alfabetismo = alfabetismo;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getAsistenciaEducacionRegular() {
        return asistenciaEducacionRegular;
    }

    public void setAsistenciaEducacionRegular(String asistenciaEducacionRegular) {
        this.asistenciaEducacionRegular = asistenciaEducacionRegular;
    }
}
