package com.roncoo.eshop.one.serivce;

import com.roncoo.eshop.one.fallback.EshopInventoryServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eshop-inventory-service",fallback = EshopInventoryServiceFallback.class)
public interface EshopInventoryService {
    @RequestMapping(value ="/product-inventory/findByProductId",method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "ProductId") Long ProductId);


}
