package com.OrdreArchive.Controller;

import com.OrdreArchive.Dao.InvoiceRepository;
import com.OrdreArchive.Dao.OrdreArchiveRepository;
import com.OrdreArchive.Entity.Invoice;
import com.OrdreArchive.Entity.OrdreArchive;
import com.OrdreArchive.Entity.PageInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RestResource
public class InvoiceController {
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private OrdreArchiveRepository ordreArchiveRepository;
    @CrossOrigin("*")
    @PostMapping("/invoice")
    public Invoice addInvoice (@RequestBody Invoice invoice)
    {
        double sum =0;
        //ArrayList<OrdreArchive>list=new ArrayList<>();
        Collection<OrdreArchive>ordreArchives=invoice.getOrdreArchives();

        for (OrdreArchive o:ordreArchives)
        {
           sum =sum+(o.getPrice()*o.getProduced());
        }
        invoice.setType("INVOICE");
        invoice.setSum(sum);
        ArrayList<OrdreArchive>list=new ArrayList<>();
        for (OrdreArchive o:ordreArchives)
        {
            o.setStatus("INVOICED");
            /*Collection<Invoice> col=o.getInvoices();
            col.add(i);
            o.setInvoices(col);

             */
           OrdreArchive or= ordreArchiveRepository.save(o);
           list.add(or);
        }


         invoice.setOrdreArchives(list);
        Invoice i=invoiceRepository.save(invoice);

        return i;
    }

    @CrossOrigin("*")
    @GetMapping("/invoices/{page}/{size}")
    public PageInvoice getallInvoices(@PathVariable("page") final int page, @PathVariable("size") final int size)
    {
        PageInvoice pageInvoice=new PageInvoice();
        long nbre=invoiceRepository.count();
        pageInvoice.setNbreElements(nbre);
        if((nbre % size)==0)
            pageInvoice.setNbrePage(nbre /size);
        else
            pageInvoice.setNbrePage((nbre/size)+1);
        Pageable paging = PageRequest.of(page, size);
        Page<Invoice> pagedResult =invoiceRepository.findAll(paging);
        pageInvoice.setInvoices(pagedResult.toList());
        return  pageInvoice;
    }


    @CrossOrigin("*")
    @GetMapping("/annulerfacture/{id}")
    public Invoice annulerfacture(@PathVariable("id") final long id)
    {
        Invoice i=invoiceRepository.findByFactureId(id);
        i.setType("AVOIR");
        invoiceRepository.save(i);
        Collection<OrdreArchive>o=i.getOrdreArchives();
        for (OrdreArchive or:o)
        {
            or.setStatus("DELIVRED");
            ordreArchiveRepository.save(or);
        }
    return  i;
    }


}
