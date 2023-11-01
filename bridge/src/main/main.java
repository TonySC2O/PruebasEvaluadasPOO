package main;

import Abstraccion.*;
import Implementacion.*;

public class main {

	public static void main(String[] args) {
        DispositivoCasa dispositivoCasa = new Laptop();
        DispositivoControl controlRemoto = new ControlRemoto(dispositivoCasa);

        controlRemoto.mostrarFoto();
        controlRemoto.cambiarVolumen(10);
        controlRemoto.ajustarDisplay();
        
	}

}
