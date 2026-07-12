/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class DestinoTuristico {

    private String nombre;
    private String pais;
    private String ciudad;
    private String descripcion;
    private String clima;
    private String idiomaPrincipal;
    private String rutaImagen;

    public DestinoTuristico(String nombre,
                            String pais,
                            String ciudad,
                            String descripcion,
                            String clima,
                            String idiomaPrincipal,
                            String rutaImagen) {

        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.clima = clima;
        this.idiomaPrincipal = idiomaPrincipal;
        this.rutaImagen = rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getIdiomaPrincipal() {
        return idiomaPrincipal;
    }

    public void setIdiomaPrincipal(String idiomaPrincipal) {
        this.idiomaPrincipal = idiomaPrincipal;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String mostrarInformacion() {
        return "Destino: " + nombre
                + "\nPaís: " + pais
                + "\nCiudad: " + ciudad
                + "\nDescripción: " + descripcion
                + "\nClima: " + clima
                + "\nIdioma principal: " + idiomaPrincipal
                + "\nRuta de imagen: " + rutaImagen;
    }
}
