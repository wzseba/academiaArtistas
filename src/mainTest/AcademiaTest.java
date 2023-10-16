package mainTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Academia;
import main.Artista;
import main.Escultor;
import main.Pintor;

class AcademiaTest {
	
	@Test
	void deberiaConstruirAcademia() {
		
		Academia academiaUno = new Academia(2);
		assertNotNull(academiaUno);
	}

	@Test
	void deberiaAgregarArtistaSiHayLugar() {
		
        Academia academiaUno = new Academia(2);
        
        Pintor pintorSeba = new Pintor(489, 3);
        Artista escultorPedro = new Escultor(112, 1);
        
        academiaUno.agregarArtista(pintorSeba);
        academiaUno.agregarArtista(escultorPedro);
        
        ArrayList<Artista> artistas = new ArrayList<Artista>();
        artistas = academiaUno.getArtistas();
        
        assertEquals(2, artistas.size());
        assertEquals(pintorSeba, artistas.get(0));
        assertEquals(escultorPedro, artistas.get(1));
		
	}
	
	@Test
	void deberiaLanzarErrorSiSeSuperaLaCapacidad() {
		
		Academia academiaUno = new Academia(2);
		
		Pintor pintorSeba = new Pintor(489, 3);
		Pintor pintorPepe = new Pintor(105, 1);
		Escultor escultorPedro =  new Escultor(402,2);
		
		academiaUno.agregarArtista(pintorSeba);
		academiaUno.agregarArtista(pintorPepe);
		
		assertThrows(Error.class, () -> {
            academiaUno.agregarArtista(escultorPedro);
        });
	}
	
	@Test
	void deberiaCalcularCuotaMensual() {
		
		Academia academia = new Academia(5);
		
		Artista pintorCaleb = new Pintor(545, 1);
        Artista pintor = new Pintor(123, 2);
        Artista pintorPepe = new Pintor(823, 2);
        Artista escultor = new Escultor(124, 3);
        Artista pintorSeba = new Pintor(465, 1);
        
        academia.agregarArtista(pintorCaleb);
        academia.agregarArtista(pintor);
        academia.agregarArtista(escultor);
        academia.agregarArtista(pintorPepe);
        academia.agregarArtista(pintorSeba);
		
		assertEquals(287.5, academia.getTotalMensualDeCuotas());
		
	}

}
