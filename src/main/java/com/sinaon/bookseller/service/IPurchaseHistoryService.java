package com.sinaon.bookseller.service;

import com.sinaon.bookseller.model.PurchaseHistory;
import com.sinaon.bookseller.repository.projection.IPurchaseItem;

import java.util.List;

/**
 * @Author ksinaon
 * @Created 2/16/2022 2:33 PM
 */
public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findIPurchasedItemsOfUser(Long userId);
}
