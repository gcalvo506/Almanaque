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
public class Sociales {
    private String extranjeros;
    private String discapacitados;
    private String jefaDeHogar;
    private String jefeDeHogar;

    public Sociales() {
    }

    public Sociales(String extranjeros, String discapacitados, String jefaDeHogar, String jefeDeHogar) {
        this.extranjeros = extranjeros;
        this.discapacitados = discapacitados;
        this.jefaDeHogar = jefaDeHogar;
        this.jefeDeHogar = jefeDeHogar;
    }

    public String getExtranjeros() {
        return extranjeros;
    }

    public void setExtranjeros(String extranjeros) {
        this.extranjeros = extranjeros;
    }

    public String getDiscapacitados() {
        return discapacitados;
    }

    public void setDiscapacitados(String discapacitados) {
        this.discapacitados = discapacitados;
    }

    public String getJefaDeHogar() {
        return jefaDeHogar;
    }

    public void setJefaDeHogar(String jefaDeHogar) {
        this.jefaDeHogar = jefaDeHogar;
    }

    public String getJefeDeHogar() {
        return jefeDeHogar;
    }

    public void setJefeDeHogar(String jefeDeHogar) {
        this.jefeDeHogar = jefeDeHogar;
    }
}
