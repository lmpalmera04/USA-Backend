package com.lpalmera.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lpalmera.backend.Documentos.Producto;
import com.lpalmera.backend.Repositorios.RepositorioProducto;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	private RepositorioProducto productRepository;

	@Override
	public void run(String... args) {
		productRepository.deleteAll();
		productRepository.saveAll(
			List.of(new Producto (1, "Neveras y Refrigeradores", "Nevera Convencional 235 Lts. Brutos Grafito Mabe - RMU235NACG1", "Producto con alta garantía de usabilidad dentro del hogar", 1129000f, 10f, true, "https://http2.mlstatic.com/D_NQ_NP_610815-MLA49767764059_042022-O.webp"),
					new Producto (2, "Neveras y Refrigeradores", "Nevera No Frost 438 Lts. Brutos Grafito Mabe - RMP420FLCG1 ", " Producto con alta garantía de usabilidad dentro del hogar", 2079900f, 120f, true, " https://http2.mlstatic.com/D_NQ_NP_926189-MLA50134025600_052022-O.webp "),			
					new Producto( 3, "Neveras y Refrigeradores", "Nevera No Frost 313 Lts. Brutos Black Steel Mabe - RMA310FZCC ", " Producto con alta garantía de usabilidad dentro del hogar ",  1949900f,  20f, true, " https://http2.mlstatic.com/D_NQ_NP_835416-MCO48043921584_102021-O.webp "),
					new Producto( 4, "Lavadoras", "Lavadora Automática de 19 kg Gris Mabe - LMA79104WGAB1", "Producto con alta garantía de usabilidad dentro del hogar" ,  2479000f,  30f, true, " https://http2.mlstatic.com/D_NQ_NP_703746-MLA44332539569_122020-O.webp "),
					new Producto( 5, "Lavadoras", "Lavadora Semiautomática de 13 Kg Blanca Mabe - LMD3124PBAB0", " Producto con alta garantía de usabilidad dentro del hogar ",  1269000f, 35f, true, " https://http2.mlstatic.com/D_NQ_NP_836802-MLA48848651300_012022-O.webp "),
					new Producto( 6, "Estufa", "Estufa de Piso de 24 Acero Inoxidable Mabe - EMC6050NFX0", "Producto con alta garantía de usabilidad dentro del hogar",  1299000f, 24f, true, "https://http2.mlstatic.com/D_NQ_NP_952713-MLA48429990060_122021-O.webp"),
					new Producto( 7, "Estufas", "Estufa de Piso a Gas de 20 Inoxidable Mabe - TX1G-6CON ", " Producto con alta garantía de usabilidad dentro del hogar ",  999999f, 50f, true, " https://http2.mlstatic.com/D_NQ_NP_793358-MLA50531526360_062022-O.webp "),
					new Producto( 8, "Televisores", "Smart TV Hyundai HYLED3248AiM HD 32 220V ", " Producto con alta garantía de usabilidad dentro del hogar ",  800000f, 100f, true, " https://http2.mlstatic.com/D_NQ_NP_641310-MLA48701310390_122021-O.webp "),
					new Producto( 9, "Televisores", "Smart TV Sony X80J Series KD-55X80J LCD 4K 55 110V/240V ", " Producto con alta garantía de usabilidad dentro del hogar ",  3999000f, 25f, true, " https://http2.mlstatic.com/D_NQ_NP_963996-MLA49129987725_022022-O.webp "),
					new Producto( 10, "Televisores", "Smart TV Samsung Series 9 UN50AU9000KXZL LED 4K 50 100V/240V ", " Producto con alta garantía de usabilidad dentro del hogar ", 2499000f, 50f, true, " https://http2.mlstatic.com/D_NQ_NP_880041-MLA48157767504_112021-O.webp "),
					new Producto( 11, "Televisores", "TV Challenger Series DVBT2 LED 32L86 T2 NG DLED HD 32 110V/240V ", " Producto con alta garantía de usabilidad dentro del hogar ",  799000f, 10f, true, " https://http2.mlstatic.com/D_NQ_NP_741210-MLA51616441685_092022-O.webp "),
					new Producto( 12, "Microondas", " Microondas Electrolux EMDO20S3GSLUG plata 20L 110V ", " Producto con alta garantía de usabilidad dentro del hogar ",  359900f, 17f, true, " https://http2.mlstatic.com/D_NQ_NP_616143-MLA47175095865_082021-O.webp "),
					new Producto( 13, "Microondas", "Microondas Kalley K-MW07 plata y negro 20L 120V ", " Producto con alta garantía de usabilidad dentro del hogar ",  328000f, 24f, true, " https://http2.mlstatic.com/D_NQ_NP_957020-MLA44868062533_022021-O.webp "),
					new Producto( 14, "Cafetera", "Cafetera Oster BVSTDCDR5 semi automática negra de filtro 127V ", " Producto con alta garantía de usabilidad dentro del hogar ",  136900f,  50f, true, " https://http2.mlstatic.com/D_NQ_NP_682067-MLA45993621262_052021-O.webp "),
					new Producto( 15, "Cafetera", "Cafetera Hamilton Beach 40715 automática negra expreso 120V ", " Producto con alta garantía de usabilidad dentro del hogar ",  779990f,  10f, true, " https://http2.mlstatic.com/D_NQ_NP_729065-MLA46478527058_062021-O.webp "),
					new Producto( 16, "Ventiladores", "Ventilador Samurai Turbo Silence Maxx 3 en 1 turbo blanco con 6 aspas color gris de plástico, 18 de diámetro 110 V ", " Producto con alta garantía de usabilidad dentro del hogar ",  199900f, 45f, true, " https://http2.mlstatic.com/D_NQ_NP_775355-MLA49976311279_052022-O.webp "),
					new Producto( 17, "Ventiladores", "Ventilador de torre Oster OTF301M negro 220 V ", " Producto con alta garantía de usabilidad dentro del hogar ",  208900f,  32f, true, " https://http2.mlstatic.com/D_NQ_NP_955044-MLA49088311338_022022-O.webp "),
					new Producto( 18, "Ventiladores", "Ventilador De Techo Kdk ", " Producto con alta garantía de usabilidad dentro del hogar ",  199500f, 100f, true, " https://http2.mlstatic.com/D_NQ_NP_604146-MCO46656017535_072021-O.webp "),			
					new Producto( 19, "Licuadoras", "Licuadora Imusa Infiny Force 10 1.75 L gris con vaso de vidrio 120V ", " Producto con alta garantía de usabilidad dentro del hogar ",  129900f,  40f, true, " https://http2.mlstatic.com/D_NQ_NP_680203-MLA50240305939_062022-O.webp "),
					new Producto( 20, "Licuadoras"	, "Licuadora portátil Oster Osterizer Classic 1.25 L cromo con vaso de vidrio 127V ", " Producto con alta garantía de usabilidad dentro del hogar ",  260000f,  80f, true, "https://http2.mlstatic.com/D_NQ_NP_700027-MLA46353394469_062021-O.webp ")

			)
		);
	}

}
