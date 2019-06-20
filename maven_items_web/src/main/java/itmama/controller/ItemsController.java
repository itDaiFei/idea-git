package itmama.controller;


import itmama.domain.Items;
import itmama.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        Items i = itemsService.findId(1);
        model.addAttribute("item",i);

        return "itemDetail";
    }
}
