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
public class Demografica {
    private String poblacionTotal;
    private String superficie;
    private String densidadPoblacion;
    private String poblacionUrbana;
    private String relacionHombresMujeres;
    private String dependenciaDemografica;
    private String natalidad;
    private String mortalidad;

    public Demografica() {
    }

    public Demografica(String poblacionTotal, String superficie, String densidadPoblacion, String poblacionUrbana, String relacionHombresMujeres, String dependenciaDemografica, String natalidad, String mortalidad) {
        this.poblacionTotal = poblacionTotal;
        this.superficie = superficie;
        this.densidadPoblacion = densidadPoblacion;
        this.poblacionUrbana = poblacionUrbana;
        this.relacionHombresMujeres = relacionHombresMujeres;
        this.dependenciaDemografica = dependenciaDemografica;
        this.natalidad = natalidad;
        this.mortalidad = mortalidad;
    }

    public String getPoblacionTotal() {
        return poblacionTotal;
    }

    public void setPoblacionTotal(String poblacionTotal) {
        this.poblacionTotal = poblacionTotal;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getDensidadPoblacion() {
        return densidadPoblacion;
    }

    public void setDensidadPoblacion(String densidadPoblacion) {
        this.densidadPoblacion = densidadPoblacion;
    }

    public String getPoblacionUrbana() {
        return poblacionUrbana;
    }

    public void setPoblacionUrbana(String poblacionUrbana) {
        this.poblacionUrbana = poblacionUrbana;
    }

    public String getRelacionHombresMujeres() {
        return relacionHombresMujeres;
    }

    public void setRelacionHombresMujeres(String relacionHombresMujeres) {
        this.relacionHombresMujeres = relacionHombresMujeres;
    }

    public String getDependenciaDemografica() {
        return dependenciaDemografica;
    }

    public void setDependenciaDemografica(String dependenciaDemografica) {
        this.dependenciaDemografica = dependenciaDemografica;
    }

    public String getNatalidad() {
        return natalidad;
    }

    public void setNatalidad(String natalidad) {
        this.natalidad = natalidad;
    }

    public String getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(String mortalidad) {
        this.mortalidad = mortalidad;
    }
}
