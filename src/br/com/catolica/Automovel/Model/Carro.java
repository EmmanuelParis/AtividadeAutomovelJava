package br.com.catolica.Automovel.Model;

import br.com.catolica.Automovel.Controller.IAutomovelInterface;

public class Carro extends Automovel implements IAutomovelInterface {

    private int quantiPortas;

    public Carro(String marca, String modelo, boolean estaLigado, int quantiPortas) {
        super(marca, modelo, estaLigado);
        this.quantiPortas = quantiPortas;
    }

    @Override
    public void acelerar(int velocidade) {
        if (estaLigado) {
            System.out.println(String.format("O carro está acelerando numa velocidade de: %d", velocidade));
        } else {
            System.out.println("Motor desligado...");
        }
    }

    @Override
    public void frear() {
        if (estaLigado) {
            System.out.println("O carro está freando...");
        } else {
            System.out.println("Motor desligado...");
        }
    }
}
