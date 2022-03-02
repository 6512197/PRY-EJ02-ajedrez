package fp.ajedrez;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Partidas {

	private List<Partida> partidas;
	
	public Partidas(List<Partida> partidas) {
		this.partidas = new ArrayList<Partida>(partidas);
	}

	public Integer getNumeroPartidas() {
		return partidas.size();
	}
	
	public String toString() {
		String partidasStr= partidas.stream()
								  .map(Object::toString)	
				                  .collect(Collectors.joining("\n"));
		return "Partidas [numPartidas ="+ getNumeroPartidas()+" partidas=" + partidasStr + "]";
	}

	
}
