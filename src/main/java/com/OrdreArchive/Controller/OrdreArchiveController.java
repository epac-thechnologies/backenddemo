package com.OrdreArchive.Controller;

import com.OrdreArchive.Dao.ClientRepository;
import com.OrdreArchive.Dao.OrdreArchiveRepository;
import com.OrdreArchive.Entity.Client;
import com.OrdreArchive.Entity.Conftoken;
import com.OrdreArchive.Entity.Ordre;
import com.OrdreArchive.Entity.OrdreArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@RestController
@RestResource
public class OrdreArchiveController {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OrdreArchiveRepository ordreRepository;
    @Autowired
    RestTemplate restTemplate;
    @CrossOrigin("*")
    @GetMapping("/ordresByOrdreId/{id}")
    public Collection<OrdreArchive> getByOrdreid(@PathVariable("id") final long id)
    {
        return  ordreRepository.findByOrdreid(id);
    }
    @CrossOrigin("*")
    @GetMapping("/ordresByOldOrdreId/{id}")
    public Collection<OrdreArchive> getByOldOrdreid(@PathVariable("id") final Integer id)
    {
        return ordreRepository.findByOldOrdreid(id);
    }
    @CrossOrigin("*")
    @GetMapping("/ordresByIsbn/{id}")
    public Collection<OrdreArchive> getByIsbn(@PathVariable("id") final String isbn) {
        return ordreRepository.findByIsbn(isbn);
    }
    @CrossOrigin("*")
    @PostMapping("/ordre")
    public  OrdreArchive addordre (@RequestBody OrdreArchive ordre)
    {

        return ordreRepository.save(ordre);
    }
    @CrossOrigin("*")
    @PostMapping("/annulerordres")
    public  void annulerordre (@RequestBody OrdreArchive ordre)
    {
  ordre.setStatus("CANCLED");
   ordreRepository.save(ordre);

    }

    @CrossOrigin("*")
    @GetMapping("/findOrdresbetween/{clientid}/{d1}/{d2}")
    public Collection<OrdreArchive> getbetween(@PathVariable("clientid") String clientid,@PathVariable("d1") String d1,@PathVariable("d2") String d2) throws ParseException {
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(d1);
        Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(d2);
        return ordreRepository.findByShipDateIsBetweenAndStatusAndClientId(date1,date2,"DELIVERED",clientid);
    }

}
@org.springframework.context.annotation.Configuration
class Configuration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();

    }
}
