package Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Pintores.Pintor;

public class Clock extends Thread {
	private boolean running = true;
	
	public Clock() {
		
	}
	
	public void stopTimer() {
		running = false;
	}
	
	public void run() {
		int completados = 0;
		int puedenPintar = 0;
		Main.main.pintoresObservador.getObservadores().get(0).pintar();
		while (running) {
			try {

				for (Pintor pintor : Main.main.pintoresObservador.getObservadores()) {
		            if(pintor.puedePintar()) {
		            	puedenPintar++;
		            	if(!pintor.aportesCompletados()) {
		    				Thread.sleep(300);
		                	pintor.pintar();
		            	}
		            }
		        }
				
				if(puedenPintar == 0) {
					System.out.println("No");
					for (Pintor pintor : Main.main.pintoresObservador.getObservadores()) {
			            if(!pintor.aportesCompletados()) {
			            	pintor.setGrupoAtascado(true);
			    			Thread.sleep(300);
			                pintor.pintar();
			            }
			        }
				}
            	puedenPintar = 0;
            	
				for (Pintor pintor : Main.main.pintoresObservador.getObservadores()) {
					if(pintor.aportesCompletados()) {
	            		completados++;
	            	}
		        }

				System.out.println(completados);
				if(completados >= Main.main.pintoresObservador.getObservadores().size()) {
					running = false;
				}else {
					completados = 0;
				}
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("e");
	}
	
}
