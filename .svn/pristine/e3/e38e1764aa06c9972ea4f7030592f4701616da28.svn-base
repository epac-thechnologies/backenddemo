package com.OrdreArchive.Dao;

import com.OrdreArchive.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface InvoiceRepository extends PagingAndSortingRepository<Invoice ,Long> {


    Invoice findByFactureId(long factureId);
   /* Pageable paging = PageRequest.of(pageNo, pageSize);
    List<Invoice> findPaginated()*/
}
