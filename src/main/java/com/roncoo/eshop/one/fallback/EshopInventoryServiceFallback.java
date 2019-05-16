package com.roncoo.eshop.one.fallback;

import com.roncoo.eshop.one.serivce.EshopInventoryService;
import org.springframework.stereotype.Component;

@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {
    @Override
    public String findByProductId(Long ProductId) {

        return "降级数据";
    }
}
