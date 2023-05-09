package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Repostaje;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.ImplRepostaje;
import aplicacion.servicios.InterfazMenu;
import aplicacion.servicios.InterfazRepostaje;

public class Menu {

	public static void main(String[] args) {
		ArrayList<Repostaje> listaRepos = new ArrayList<>();
		ImplRepostaje miRepo = new ImplRepostaje();
		ImplMenu miMenu= new ImplMenu();
		int opcion;
		
		do {
			miMenu.mostrarMenu();
			opcion = miRepo.CapturaOpcion("\nIntroduce una opción", 1, 6);
			
			switch(opcion) {
			case 1:
				listaRepos.add(miRepo.RepostajeNormal());
				break;
			case 2:
				listaRepos.add(miRepo.RepostajeFactura());
				break;
			case 3:
				miRepo.MostrarRepostajes(listaRepos);
				break;
			case 4:
				listaRepos = miRepo.BorrarRepostaje(listaRepos);
				break;
			case 5:
				listaRepos = miRepo.ModificarRepostaje(listaRepos);
				break;
			}
			
		}while(opcion != 6);

	}
						
}
			
		