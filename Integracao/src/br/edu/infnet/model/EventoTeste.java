package br.edu.infnet.model;

public class EventoTeste {
	
	public static void main (String [] args) {
		
		final int INSCRICOES = 5;
		
		String [] nomes = {"Café ágil", "Java Day", "Aula de Fundamentos"};
		
		String [] semInscricoes = new String[15];
		int[] capacidades = {3,2,4};
		
		int x = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			Evento evento = new Evento(nomes[0], "Local", capacidades[i]);
			
			for (int j = 0; j < INSCRICOES; j++) {
				
				if(evento.temVaga()) {
					evento.inscrever();
				} else {
					semInscricoes[x++] = evento.toString();
				}
							
			}		
			
		}
	
	for (String ev : semInscricoes) {
		System.out.println("Evento sem inscrição " + ev);
		
	}			
				
		Evento ev1 = new Evento("café ágil", "sala 1", 30);
		
		if (ev1.temVaga()) {
			System.out.println("Opa... ainda temos vagas!!");
		} else {
			System.out.println("Limite de vagas atingido!");
		}
		
		Evento ev2 = new Evento("Java Day", "Auditório", 100);
		ev2.inscrever();
		
		Evento ev3 = new Evento("Java Day", "Auditório", -200);
		System.out.println("Inscrição realizada com sucesso!");
		
		System.out.println("EV1 " + ev1);
		System.out.println("EV2 " + ev2);
		System.out.println("EV1 " + ev3);
	}

}
