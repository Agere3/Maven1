package com.example.JpApp.magicitem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/magicitem/{magicItem}")
public class MagicItemController {

    private final MagicItemService magicItemService;

    @Autowired
    public MagicItemController(MagicItemService magicItemService){
        this.magicItemService = magicItemService;
    }

    @GetMapping
    public List<MagicItem> getMagicItem(@PathVariable String magicItem){
        return magicItemService.getMagicItem(magicItem);
    }
}
