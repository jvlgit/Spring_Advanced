package be.vdab.cors.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("kwadraat")
public class KwadraatController {
    @GetMapping("{getal}")
    int kwadraat(@PathVariable int getal) {
        return getal * getal;
    }
}
