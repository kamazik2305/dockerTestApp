package com.example.dockerTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DockerController {

    @GetMapping("/")
    public String DockerPage(Model model)
    {
        model.addAttribute("title", "DockerTestApp");
        return "homepage";
    }

    @GetMapping("/about")
    public String NextPage()
    {
        return "about-section";
    }
}
