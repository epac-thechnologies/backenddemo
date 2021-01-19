package com.OrdreArchive;

import com.OrdreArchive.Dao.OrdreArchiveRepository;
import com.OrdreArchive.Entity.OrdreArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Collection;
import java.util.Date;

@SpringBootApplication
public class OrdreArchiveApplication   {
@Autowired
private OrdreArchiveRepository ordreArchiveRepository;
	public static void main(String[] args) {
		SpringApplication.run(OrdreArchiveApplication.class, args);
	}
}
