package br.edu.infnet.fundamentos;

class PerfilFormatado {
    public static void main (String [] args) {
    	
    	Profissional profissional = new Profissional();
    	profissional.nome = "Jarlene Ferreira";
    	profissional.profissao = "Programadora";
    	profissional.idade =  24;
    	profissional.estado = "Alagoas";
    	profissional.altura = 1.47;
    	profissional.professor = false;
    	profissional.cidade = "Porto Calvo"; 
    	profissional.salario = 2.600;
    	profissional.empresa = "Amarante Hoteis";

       profissional.impressao();

      

    }
}