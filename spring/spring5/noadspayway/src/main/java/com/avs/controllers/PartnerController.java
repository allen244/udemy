package com.avs.controllers;

import com.avs.repositories.PartnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartnerController {
    private PartnerRepository partnerRepository;

    public PartnerController(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    @RequestMapping("/partners")
    public String getPartners(Model model) {
        model.addAttribute("partners", partnerRepository.findAll());
        return "partners";
    }
}
