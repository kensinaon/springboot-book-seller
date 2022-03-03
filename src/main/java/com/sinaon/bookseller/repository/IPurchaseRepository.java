package com.sinaon.bookseller.repository;

import com.sinaon.bookseller.model.PurchaseHistory;
import com.sinaon.bookseller.repository.projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author ksinaon
 * @Created 2/16/2022 1:26 PM
 */
public interface IPurchaseRepository extends JpaRepository<PurchaseHistory, Long> {

    @Query("select b.title as title, ph.price as price, ph.purchaseTime as purchaseTime from PurchaseHistory ph left join Book b on b.id = ph.bookId where ph.userId = :userId")
    List<IPurchaseItem> findAllPuchasesOfUser(@Param("userId") Long userId);
}
