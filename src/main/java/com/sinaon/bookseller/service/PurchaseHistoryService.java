package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.PurchaseHistory;
import com.sinaon.bookseller.repository.IPurchaseRepository;
import com.sinaon.bookseller.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author ksinaon
 * @Created 2/16/2022 2:33 PM
 */
@Service
public class PurchaseHistoryService implements IPurchaseHistoryService{

    @Autowired
    private IPurchaseRepository purchaseRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findIPurchasedItemsOfUser(Long userId){
        return purchaseRepository.findAllPuchasesOfUser(userId);
    }
}
