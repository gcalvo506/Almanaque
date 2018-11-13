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
public class Canton {
    private Demografica demografica;
    private Vivienda vivienda;
    private Educacion educacion;
    private Economia economia;
    private Sociales sociales;
    private String imagenBandera;

    public Canton() {
    }

    public Canton(Demografica demografica, Vivienda vivienda, Educacion educacion, Economia economia, Sociales sociales, String imagenBandera) {
        this.demografica = demografica;
        this.vivienda = vivienda;
        this.educacion = educacion;
        this.economia = economia;
        this.sociales = sociales;
        this.imagenBandera = imagenBandera;
    }

    public Demografica getDemografica() {
        return demografica;
    }

    public void setDemografica(Demografica demografica) {
        this.demografica = demografica;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Educacion getEducacion() {
        return educacion;
    }

    public void setEducacion(Educacion educacion) {
        this.educacion = educacion;
    }

    public Economia getEconomia() {
        return economia;
    }

    public void setEconomia(Economia economia) {
        this.economia = economia;
    }

    public Sociales getSociales() {
        return sociales;
    }

    public void setSociales(Sociales sociales) {
        this.sociales = sociales;
    }

    public String getImagenBandera() {
        return imagenBandera;
    }

    public void setImagenBandera(String imagenBandera) {
        this.imagenBandera = imagenBandera;
    }
}
