package br.com.catolica.Automovel.Model;

public abstract class Automovel {

    protected String marca;
    protected String modelo;
    protected boolean estaLigado;

    public Automovel(String marca, String modelo, boolean estaLigado) {
        this.marca = marca;
        this.modelo = modelo;
        this.estaLigado = estaLigado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void ligarMotor() {
        estaLigado = true;
    }

    @Override
    public String toString() {
        return String.format("<Marca = %s, Modelo = %s, Está Ligado = %b",
                marca, modelo, estaLigado);
    }
}
