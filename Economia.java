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
public class Economia {
    private String noLaboran;
    private String laboran;
    private String hombresLaboran;
    private String mujeresLaboran;
    private String noAsegurada;

    public Economia() {
    }

    public Economia(String noLaboran, String laboran, String hombresLaboran, String mujeresLaboran, String noAsegurada) {
        this.noLaboran = noLaboran;
        this.laboran = laboran;
        this.hombresLaboran = hombresLaboran;
        this.mujeresLaboran = mujeresLaboran;
        this.noAsegurada = noAsegurada;
    }

    public String getNoLaboran() {
        return noLaboran;
    }

    public void setNoLaboran(String noLaboran) {
        this.noLaboran = noLaboran;
    }

    public String getLaboran() {
        return laboran;
    }

    public void setLaboran(String laboran) {
        this.laboran = laboran;
    }

    public String getHombresLaboran() {
        return hombresLaboran;
    }

    public void setHombresLaboran(String hombresLaboran) {
        this.hombresLaboran = hombresLaboran;
    }

    public String getMujeresLaboran() {
        return mujeresLaboran;
    }

    public void setMujeresLaboran(String mujeresLaboran) {
        this.mujeresLaboran = mujeresLaboran;
    }

    public String getNoAsegurada() {
        return noAsegurada;
    }

    public void setNoAsegurada(String noAsegurada) {
        this.noAsegurada = noAsegurada;
    }
}
