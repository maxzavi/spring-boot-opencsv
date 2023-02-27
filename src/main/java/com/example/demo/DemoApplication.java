package com.example.demo;

import java.io.IOException;
import java.io.StringReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.opencsv.CSVReader;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		readString();
	}

	public static void readString() throws IOException{
		String line = "Id,documento,Nombres,edad,peso\n1,0987777,\"Perez Perez, Juan\",45,85.9\n2,11223321,Rosa Chaves,18,50.87";
		final CSVReader reader = new CSVReader(new StringReader(line));

		// read line by line
		String[] record = null;
		int counter=0;
		while ((record = reader.readNext()) != null) {
			counter++;
			if (counter==1) LOG.info("Titulos: {} {} {} {} {}",record[0], record[1],record[2],record[3],record[4]);
			else LOG.info("Registros: {} {} {} {} {}",record[0], record[1],record[2],record[3],record[4]);

		}
		reader.close();

	}
}
