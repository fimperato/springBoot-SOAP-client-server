package it.myst.test.soap.documento.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import it.myst.test.soap.documentodef.Documento;


@Component
public class DocumentoDAO {

	private static List<Documento> documenti;

	@PostConstruct
	public void initData()
	{
		documenti = new ArrayList<Documento>();
		Documento documento1 = new Documento();
		documento1.setId(1);
		documento1.setTitle("title-doc1");
		documento1.setFilename("filename-doc1");
		documento1.setByte("0123456789");
		documento1.setUserSave("user-save-1");
		documenti.add(documento1);

		Documento documento2 = new Documento();
		documento2.setId(2);
		documento2.setTitle("title-doc2");
		documento2.setFilename("doc_cartaIdentita.pdf"); // doc_cartaIdentita.pdf
		documento2.setByte("0123456789");
		documento2.setUserSave("user-save-1");
		documenti.add(documento2);
		

	}
	/**
	 * Get the list of documento
	 * 
	 * @return documento list
	 */
	public List<Documento> list() {
		return documenti;
	}

	/**
	 * Get documento by filename if exists, else return null
	 * 
	 * @param filename
	 * @return documento
	 */
	public Documento getDocumentoByFilename(String filename) {
		for (Documento documento : documenti) {
			if (documento.getFilename().equalsIgnoreCase(filename)) {
				return documento;
			}
		}
		return null;
	}

	/**
	 * Documento upload
	 * 
	 * @param documento
	 * @return upload documento
	 */
	public Documento upload(Documento documento) {
		int min=1;
		int max=100;
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(max + 1 - min) + min;
		documento.setId(randomNumber);
		documenti.add(documento);
		return documento;
	}
}
