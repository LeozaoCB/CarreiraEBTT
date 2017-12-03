package br.tatuapu.controller;

import java.io.File;
import java.io.IOException;



import br.tatuapu.reader.LeitorXLS;

public class Executor {
	public static void main(String[] args) {
		LeitorXLS leitor = new LeitorXLS();
		//leitor.carrega("dados/2017-20h.ods");
		
		 //Creating File object of .ods file
        File file = new File("dados/2017-20h.ods");
        leitor.readODS(file);
	}
}