package be.vdab.cors.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("kwadraat")
public class KwadraatController {
    @GetMapping("{getal}")
    @Operation(summary = "het kwadraat van een getal")
    int kwadraat(@PathVariable int getal) {
        return getal * getal;
    }
}
