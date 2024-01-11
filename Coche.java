public class Coche {
    public String Marca;
    public boolean Estado;
    public Long Kilometros;
    public String Caballos;


    public String getMarca() {
        return Marca;
    }

    public boolean isEstado() {
        return Estado;
    }


    public Long getKilometros() {
        return Kilometros;
    }

    public String getCaballos() {
        return Caballos;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
    public void setKilometros(Long kilometros) {
        Kilometros = kilometros;
    }

    public void setCaballos(String caballos) {
        Caballos = caballos;
    }
}
