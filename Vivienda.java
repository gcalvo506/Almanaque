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
public class Vivienda {
    private String viviendasIndividuales;
    private String personasPorVivienda;
    private String viviendasEnBuenEstado;
    private String viviendasHacinadas;

    public Vivienda() {
    }

    public Vivienda(String viviendasIndividuales, String personasPorVivienda, String viviendasEnBuenEstado, String viviendasHacinadas) {
        this.viviendasIndividuales = viviendasIndividuales;
        this.personasPorVivienda = personasPorVivienda;
        this.viviendasEnBuenEstado = viviendasEnBuenEstado;
        this.viviendasHacinadas = viviendasHacinadas;
    }

    public String getViviendasIndividuales() {
        return viviendasIndividuales;
    }

    public void setViviendasIndividuales(String viviendasIndividuales) {
        this.viviendasIndividuales = viviendasIndividuales;
    }

    public String getPersonasPorVivienda() {
        return personasPorVivienda;
    }

    public void setPersonasPorVivienda(String personasPorVivienda) {
        this.personasPorVivienda = personasPorVivienda;
    }

    public String getViviendasEnBuenEstado() {
        return viviendasEnBuenEstado;
    }

    public void setViviendasEnBuenEstado(String viviendasEnBuenEstado) {
        this.viviendasEnBuenEstado = viviendasEnBuenEstado;
    }

    public String getViviendasHacinadas() {
        return viviendasHacinadas;
    }

    public void setViviendasHacinadas(String viviendasHacinadas) {
        this.viviendasHacinadas = viviendasHacinadas;
    }
}
