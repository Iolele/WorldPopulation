package com.justplay.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopMVCController {

    @Autowired
    WorldPopService worldPopService;

    @GetMapping("/world-pop")
    String getWorldPop(Model model) {
        WorldPop worldPop = worldPopService.fetchWorldPopFromApi();
        model.addAttribute("worldPop", worldPop.getWorldPopulation().getWorldPop());
        return "worldpop";
    }
}
