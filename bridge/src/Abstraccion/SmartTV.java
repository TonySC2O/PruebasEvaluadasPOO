package Abstraccion;


public class SmartTV extends DispositivoEnCasa {
	
	private int canal;
	
    public SmartTV() {
        super("SmartTV");
        this.canal = 0;
    }

	@Override
	public void mostrarInfo() {
		System.out.println("Dispositivo: " + dispositivo);
		System.out.println("Estado: " + estado);
		System.out.println("Imagen actual: " + imagenActual);
		System.out.println("Volumen: " + Integer.toString(volumen));
		System.out.println("Imagen ajustada: " + Boolean.toString(ajustado));
		System.out.println("canal actual: " + Integer.toString(canal));
	}
	
    @Override
    public void cambiarCanal(int pCanal) {
    	if(estado.equals("Encendido")) {
    		canal = pCanal;
    		System.out.println("Se ha cambiado el canal al canal: " + pCanal);
    	}else {
			System.out.println("El dispositivo no esta encendido");
		}
    }
    
}
