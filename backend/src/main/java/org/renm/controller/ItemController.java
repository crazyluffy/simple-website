package org.renm.controller;

import org.renm.dao.ItemPage;
import org.renm.dao.entity.Item;
import org.renm.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ItemController {

    private ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @RequestMapping("/item")
    ItemPage searchItems(@RequestParam(name = "page", defaultValue = "0") int page,
                         @RequestParam(name = "size", defaultValue = "15") int size) {
        Page<Item> items = itemRepository.findAll(PageRequest.of(page, size));
        return ItemPage.builder().
                items(items.getContent()).
                page(page).
                size(items.getNumberOfElements()).
                totalPages(items.getTotalPages()).
                totalElements(items.getTotalElements()).
                build();
    }

}
