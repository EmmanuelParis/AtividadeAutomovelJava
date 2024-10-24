package br.com.catolica.Automovel.Model;

import br.com.catolica.Automovel.Controller.IAutomovelInterface;

public class Moto extends Automovel implements IAutomovelInterface {

    private boolean fazRamDamDam;

    public Moto(String marca, String modelo, boolean estaLigado, boolean fazRamDamDam) {
        super(marca, modelo, estaLigado);
        this.fazRamDamDam = fazRamDamDam;
    }

    @Override
    public void acelerar(int velocidade) {
        if (estaLigado) {
            System.out.println(String.format("A moto está acelerando numa velocidade de: %d", velocidade));
        } else {
            System.out.println("Motor desligado...");
        }
    }

    @Override
    public void frear() {
        if (estaLigado) {
            System.out.println("A moto está freando...");
        } else {
            System.out.println("Motor desligado...");
        }
    }
}
