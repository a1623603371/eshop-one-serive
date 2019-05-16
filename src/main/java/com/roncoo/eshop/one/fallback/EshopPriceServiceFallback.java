package com.roncoo.eshop.one.fallback;

import com.roncoo.eshop.one.serivce.EshopPriceService;
import org.springframework.stereotype.Component;

@Component
public class EshopPriceServiceFallback implements EshopPriceService {
    @Override
    public String findByProductId(Long ProductId) {
        return null;
    }
}
