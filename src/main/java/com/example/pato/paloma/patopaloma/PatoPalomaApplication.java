package com.example.pato.paloma.patopaloma;

import com.example.pato.paloma.patopaloma.entity.Paloma;
import com.example.pato.paloma.patopaloma.entity.Pato;
import com.example.pato.paloma.patopaloma.interfaces.Oviparos;
import org.springframework.boot.SpringApplication;


public class PatoPalomaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PatoPalomaApplication.class, args);

		Pato pato = new Pato();
		pato.setIdPato(1);
		pato.setPatas(2);
		pato.setPeso(200);
		//Paloma paloma = new Paloma();
		//paloma.setPaloma("asdf");
		//paloma.setIdPaloma(3);
		Oviparos oviparo = pato;
		Paloma paloma = (Paloma) oviparo;
		paloma.moverse();
	}



}
