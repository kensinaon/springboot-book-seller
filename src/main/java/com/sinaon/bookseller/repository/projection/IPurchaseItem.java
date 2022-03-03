package com.sinaon.bookseller.repository.projection;

import java.time.LocalDateTime;

/**
 * @Author ksinaon
 * @Created 2/16/2022 1:28 PM
 */
public interface IPurchaseItem {

    String getTitle();
    String getPrice();
    LocalDateTime getPurchaseTime();
}
