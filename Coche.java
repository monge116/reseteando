public class Coche {
    public String Marca;
    public boolean Estado;
    public String Color;
    public Long Kilometros;


    public String getMarca() {
        return Marca;
    }

    public boolean isEstado() {
        return Estado;
    }

    public String getColor() {
        return Color;
    }

    public Long getKilometros() {
        return Kilometros;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setKilometros(Long kilometros) {
        Kilometros = kilometros;
    }
}
