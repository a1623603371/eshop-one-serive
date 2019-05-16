package com.roncoo.eshop.one.contrller;

import com.roncoo.eshop.one.serivce.EshopInventoryService;
import com.roncoo.eshop.one.serivce.EshopPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class EshopOneServiceController {
    @Autowired
    private EshopInventoryService eshopInventoryService;
    @Autowired
    private EshopPriceService eshopPriceService;
    @RequestMapping("/findInventProductId")
    public String findInventProductId(Long productId){
        return eshopInventoryService.findByProductId(productId);
    }

    @RequestMapping("/findPriceProductId")
    public String findPriceProductId(Long productId){
        return eshopPriceService.findByProductId(productId);
    }
}
