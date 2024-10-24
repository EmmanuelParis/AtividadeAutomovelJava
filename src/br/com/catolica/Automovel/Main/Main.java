package br.com.catolica.Automovel.Main;

import br.com.catolica.Automovel.Model.Carro;
import br.com.catolica.Automovel.Model.Moto;

public class Main {

    public static void main(String[] args){
        Moto moto = new Moto("Kawasaki", "Ninja", false, true);
        Carro carro = new Carro("Porsche", "911", false, 2);

        carro.ligarMotor();
        moto.ligarMotor();

        moto.acelerar(240);
        carro.acelerar(160);

        moto.frear();
        carro.frear();



    }

}
